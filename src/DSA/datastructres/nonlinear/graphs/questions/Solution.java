package DSA.datastructres.nonlinear.graphs.questions;

class Solution {
    int[] dx={-1,-1,-1,0,0,1,1,1};
    int[] dy={-1,0,1,-1,1,-1,0,1};
    public int countElements(char[][] grid){
        int n=grid.length;
        int m=grid[0].length;
        boolean[][] visited=new boolean[n][m];
        int islandCount=0;
        for (int i=0;i<n;i++){
            for (int j=0;j<m;j++){
                if (grid[i][j]=='L'&&!visited[i][j]){
                    dfs(i,j,grid,visited,n,m);
                    islandCount++;
                }
            }
        }
        return islandCount;
    }
    void dfs(int x ,int y,char[][] grid,boolean[][] visited,int n,int m){
        visited[x][y]=true;
        for (int dir=0;dir<0;dir++){
            int newX=x+dx[dir];
            int newY=y+dy[dir];

            if (newX>=0 && newY>=0&& newX<n && newY<m && grid[newX][newY]=='L' && !visited[newX][newY]){
                dfs(newX,newY,grid,visited,n,m);
            }
        }
    }
}
