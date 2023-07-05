package space.leetcode.prac;

/**
 * https://leetcode.com/problems/construct-string-from-binary-tree/
 * Definition for a binary tree node.
 * public class TreeNode {
 * int val;
 * TreeNode left;
 * TreeNode right;
 * TreeNode() {}
 * TreeNode(int val) { this.val = val; }
 * TreeNode(int val, TreeNode left, TreeNode right) {
 * this.val = val;
 * this.left = left;
 * this.right = right;
 * }
 * }
 */
class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;

    TreeNode() {
    }

    TreeNode(int val) {
        this.val = val;
    }

    TreeNode(int val, TreeNode left, TreeNode right) {
        this.val = val;
        this.left = left;
        this.right = right;
    }
}

public class PreOrder606 {
    public static void preOrder(TreeNode node, StringBuilder answer) {
        answer.append("(");
        if (node != null) {
            answer.append(node.val);
            if (node.left == null && node.right != null) // this would be key
                answer.append("()");
            if (node.left != null)
                preOrder(node.left, answer);
            if (node.right != null)
                preOrder(node.right, answer);
            answer.append(")");
        }
    }

    public static String tree2str(TreeNode root) {
        StringBuilder sb = new StringBuilder();
        preOrder(root, sb);
        sb.deleteCharAt(0);
        sb.deleteCharAt(sb.length() - 1);
        return sb.toString();
    }

    public static void main(String[] args) {
        System.out.println(tree2str(new TreeNode(1, new TreeNode(2, null, new TreeNode(4)), new TreeNode(3))));
        System.out.println(tree2str(new TreeNode(1, new TreeNode(2, new TreeNode(4), null), new TreeNode(3))));
    }

}
