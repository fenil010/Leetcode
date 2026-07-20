class Solution {
    public List<List<Integer>> shiftGrid(int[][] grid, int k) {
        int m = grid.length, n = grid[0].length;
        int total = m * n;
        k %= total;

        List<List<Integer>> result = new ArrayList<>();
        for (int i = 0; i < m; i++) {
            result.add(new ArrayList<>(Collections.nCopies(n, 0)));
        }

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                int flat = i * n + j;          // current flattened index
                int shifted = (flat + k) % total; // where it lands
                result.get(shifted / n).set(shifted % n, grid[i][j]);
            }
        }
        return result;
    }
}
