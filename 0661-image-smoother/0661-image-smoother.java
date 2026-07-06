class Solution {
    public int[][] imageSmoother(int[][] img) {
        int row = img.length;
        int col = img[0].length;
        
        int[][] ans = new int[row][col];
        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                int sum = 0;
                int count = 0;
                for(int r = i-1;r<=i+1;r++){
                    for (int c = j - 1; c <= j + 1; c++) {

                        if (r >= 0 && r < row && c >= 0 && c < col) {
                            sum += img[r][c];
                            count++;
                        }
                    }
                }
                ans[i][j] = sum/count;
            }
        }
        return ans;
    }
}