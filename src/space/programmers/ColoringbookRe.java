package space.programmers;

public class ColoringbookRe {
    static int[] dx = {-1,1,0,0};
    static int[] dy = {0,0,-1,1};
    static int[][] picture;

    public static void main(String[] args){
        int[][] picture = {
                {1,1,1,1},
                {1,2,2,0},
                {1,0,0,1},
                {0,3,3,1},
                {0,3,0,3},
                {0,0,0,3}
        };

        int[] a =new ColoringbookRe().solution(6,4,picture);
        for(int i=0;i<a.length;i++){
            System.out.println(a[i]);
        }
    }
    public int[] solution(int m, int n, int[][] picture) {
        int numberOfArea = 0;
        int maxSizeOfOneArea = 0;
        int width=0;
        this.picture=picture;

        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(picture[i][j]!=0) {
                    //dfs
                    width = dfs(i, j, m, n, picture[i][j]);
                    if (maxSizeOfOneArea < width) maxSizeOfOneArea = width;

                    numberOfArea++;
                }
            }
        }

        int[] answer = new int[2];
        answer[0] = numberOfArea;
        answer[1] = maxSizeOfOneArea;
        return answer;
    }
    public static int dfs(int y, int x, int m, int n, int areaNum){
        int cnt=1;
        if(picture[y][x]!= areaNum) return 0;
        picture[y][x]=0;
        for(int i=0;i<4;i++){
            int ny = y + dy[i];
            int nx = x + dx[i];

            if(ny<0||ny>=m || nx<0||nx>=n|| picture[ny][nx]==0) continue;
            if(picture[ny][nx]!=areaNum) continue;
            cnt += dfs(ny,nx,m,n,areaNum);
        }
        return cnt;
    }

}
