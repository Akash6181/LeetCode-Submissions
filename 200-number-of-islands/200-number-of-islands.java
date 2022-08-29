class Solution {
    public void makeZeros(char[][]grid , int i, int j){
        int m=grid.length;
        int n=grid[0].length;
        if(i<0||j<0||i==m||j==n){
            return;
        }
        if(grid[i][j]=='0'){
            return;
        }
        grid[i][j]='0';
        makeZeros(grid, i,j+1);
        makeZeros(grid, i+1,j);
        makeZeros(grid, i,j-1);
        makeZeros(grid, i-1,j);        
    }        
    public int numIslands(char[][] grid) {
        int m = grid.length;
        int n = grid[0].length;
        int res=0;
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(grid[i][j]=='1'){
                    res++;
                    makeZeros(grid,i,j);
                }
            }
        }
        return res;        
    }
}