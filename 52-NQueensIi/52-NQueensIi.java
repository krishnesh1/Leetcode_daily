// Last updated: 21/07/2026, 23:14:57
class Solution {
    public int res=0;
       public boolean isSafe(boolean [][]grid,int r,int c){
        //left up
        for(int i=r-1,j=c-1;i>=0&&j>=0;i--,j--){
            if(grid[i][j]==true)return false;
        }

        //up 
        for(int i=r-1;i>=0;i--){
            if(grid[i][c]==true)return false;
        }

        //right up
        for(int i=r-1,j=c+1;i>=0&&j<grid.length;i--,j++){
            if(grid[i][j]==true)return false;
        }
        return true;
    }

    public void solve(boolean [][]grid,int row,int n){
        if(row==grid.length){
            res++;
            return;
        }
        for(int i=0;i<n;i++){
            if(isSafe(grid,row,i)){
                grid[row][i]=true;
                solve(grid,row+1,n);
                grid[row][i]=false;
            }
        }
    }

    public int totalNQueens(int n) {
        boolean [][]grid=new boolean[n][n];
        res=0;
        solve(grid,0,n);
        return res;
    }
}
