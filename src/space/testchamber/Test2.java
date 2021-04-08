package space.testchamber;

import java.util.Arrays;

public class Test2 {


    // Side length of the board
    private static int N;

    private static int[][] answer;
    private static int[] top, right, bottom, left;


    public static void main(String[] args) {

        int[] clues = new int[]{3, 2, 2, 3, 2, 1,
                1, 2, 3, 3, 2, 2,
                5, 1, 2, 2, 4, 3,
                3, 2, 1, 2, 2, 4};

        int[][] expected = new int[][]{new int[]{2, 1, 4, 3, 5, 6},
                new int[]{1, 6, 3, 2, 4, 5},
                new int[]{4, 3, 6, 5, 1, 2},
                new int[]{6, 5, 2, 1, 3, 4},
                new int[]{5, 4, 1, 6, 2, 3},
                new int[]{3, 2, 5, 4, 6, 1}};

    }

    public static int[][] solvePuzzle(int[] clues) {

        N = clues.length / 4;

        // Split up and initialize the clues
        top = new int[N];
        right = new int[N];
        bottom = new int[N];
        left = new int[N];

        for (int i = 0; i < N; i++) {
            top[i] = clues[i];
            right[i] = clues[N + i];
            bottom[i] = clues[N * 2 + i];
            left[i] = clues[N * 3 + i];
        }

        // First set all spots to 0 (unassigned)
        int[][] board = new int[N][N];

        answer = new int[N][N];

        backtrack(board);

        return answer;
    }

    /**
     * Backtracking Algorithm
     * 1) Find row, col of an unassigned cell
     * 2) If there is none, return true
     * 3) For digits from 1 to N
     * a) If there is no conflict for digit at row, col
     * assign digit to row, col and recursively try fill in rest of grid
     * b) If recursion successful, return true
     * c) Else, remove digit and try another
     * 4) If all digits have been tried and nothing worked, return false
     **/

    private static boolean backtrack(int[][] board) {

        int[] emptyCell = findEmptyCell(board);

        // If there is no unassigned location, we are done
        if (emptyCell.length == 0) {
            answer = board;
            return true; // success!
        }

        int row = emptyCell[0];
        int col = emptyCell[1];

        for (int guess = 1; guess <= N; guess++) {

            board[row][col] = guess;
            boolean safe = noConflict(board, row, col, guess);

            if (safe) {
                if (backtrack(board))
                    return true;
                else {
                    board[row][col] = 0;
                }
            } else {
                board[row][col] = 0;
            }
        }
        return false;
    }


    /**
     * Looks for an unassigned cell
     * If found, returns the location of the empty cell
     *
     * @param board, Current state of the game board
     * @return the location of the empty cell,
     * or an empty array to indicate nothing was found
     **/

    private static int[] findEmptyCell(int[][] board) {

        for (int i = 0; i < N; i++)
            for (int j = 0; j < N; j++)
                if (board[i][j] == 0) {
                    return new int[]{i, j};
                }

        return new int[0];
    }

    /**
     * Checks if placing a value on the board  at row, col will cause any conflict
     *
     * @param board, Current state of the game board
     * @param row,   Row to check for conflict
     * @param col,   Column to check for conflict
     * @param guess, Number that may cause conflict
     * @return true if there's no conflict, false otherwise
     **/

    private static boolean noConflict(int[][] board, int row, int col, int guess) {

        return !hasDuplicates(board, row, col, guess) && validMove(board, row, col);
    }


    /**
     * Checks if there's any duplicate numbers in the y and x
     *
     * @param board, Current state of the game board
     * @param y,   Row to check for duplicates
     * @param x,   Column to check for duplicates
     * @param guess, Number to look for
     * @return true if duplicates found, false otherwise
     **/

    static boolean hasDuplicates(int[][] board, int y, int x, int guess) {

        for (int i = 0; i < N; i++) {
            if (i == x)
                continue;
            if (board[y][i] == guess)
                return true;
        }

        for (int j = 0; j < N; j++) {
            if (j == y)
                continue;
            if (board[j][x] == guess)
                return true;
        }

        return false;
    }


    /**
     * Checks if the newly placed value is a valid move according to the clues
     *
     * @return true if it's valid, false otherwise
     **/

    static boolean validMove(int[][] board, int row, int col) {

        // Convert column into row in order to use checkRow()
        int[] colToRow = new int[N];

        for (int i = 0; i < N; i++)
            colToRow[i] = board[i][col];

        // Check if they contain any zeros
        boolean rowContainsZero = Arrays.toString(board[row]).contains("0");
        boolean colContainsZero = Arrays.toString(colToRow).contains("0");

        if (rowContainsZero && colContainsZero)
            return true;

        if (!rowContainsZero && colContainsZero)
            return checkRow(left[N - 1 - row], right[row], board[row]);


        if (rowContainsZero && !colContainsZero)
            return checkRow(top[col], bottom[N - 1 - col], colToRow);


        // Compare (top && bottom) && (left && right)
        return checkRow(top[col], bottom[N - 1 - col], colToRow) && checkRow(left[N - 1 - row], right[row], board[row]);
    }

    /**
     * Checks if the row/col is valid against clues
     * starting from left to right for rows
     * and
     * top to bottom for columns
     * Note: for columns top = left and bottom = right
     * (the column gets rotated into a row)
     *
     * @param left,      clue on the left
     * @param right,     clue on the right
     * @param buildings, buildings we are checking
     * @return true if it's valid, false otherwise
     **/

    static boolean checkRow(int left, int right, int[] buildings) {

        if (left == 0 && right == 0)
            return true;

        // Looking right to left
        if (left == 0 && right != 0)
            return right == viewCount(false, buildings);


        // Looking left to right
        if (left != 0 && right == 0)
            return left == viewCount(true, buildings);


        // Looking both from the left and from the right
        return (left == viewCount(true, buildings) && right == viewCount(false, buildings));
    }


    /**
     * Counts the number of buildings you can see from a clue
     *
     * @param forward,  direction to count the buildings in
     *                  forward = left -> right
     *                  backward = right -> left
     * @param buildings Buildings to count
     * @return Number of viewable buildings
     **/

    static int viewCount(boolean forward, int[] buildings) {

        int count = 0;
        int max = 0;

        if (forward) {

            if (buildings[0] != 0) {
                max = buildings[0];
                count++;
            }

            for (int i = 1; i < N; i++) {
                int building = buildings[i];
                if (building > buildings[i - 1] && building > max) {
                    count++;
                    max = building;
                }
            }
        } else {

            if (buildings[N - 1] != 0) {
                max = buildings[N - 1];
                count++;
            }

            for (int i = N - 2; i >= 0; i--) {
                int building = buildings[i];
                if (buildings[i] > buildings[i + 1] && building > max) {
                    count++;
                    max = building;
                }
            }
        }

        return count;
    }


}
