class Solution {
    public int countNegatives(int[][] grid) {
        int n_count=0;
        for(int i = 0 ;i<grid.length;i++){
            for(int j = 0;j<grid[0].length;j++){
                if(grid[i][j]<0){
                    n_count+=1;
                }
            }
        }

        return n_count;
    }
}