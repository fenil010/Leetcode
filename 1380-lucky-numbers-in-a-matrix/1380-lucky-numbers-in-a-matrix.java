class Solution {
    public List<Integer> luckyNumbers(int[][] matrix) {
        List<Integer> min = new ArrayList<>();
        List<Integer> result = new ArrayList<>();

        for (int i = 0; i < matrix.length; i++) {
            int min_ele = Integer.MAX_VALUE;
            for (int j = 0; j < matrix[0].length; j++) {
                if (min_ele > matrix[i][j]) {
                    min_ele = matrix[i][j];
                }
            }
            min.add(min_ele);
        }

        for (int j = 0; j < matrix[0].length; j++) {
            int max_ele = Integer.MIN_VALUE;
            for (int i = 0; i < matrix.length; i++) {
                if (max_ele < matrix[i][j]) {
                    max_ele = matrix[i][j];
                }
            }
           if (min.contains(max_ele)) { 
                result.add(max_ele);
            }
        }

      
        return result;

    }
}