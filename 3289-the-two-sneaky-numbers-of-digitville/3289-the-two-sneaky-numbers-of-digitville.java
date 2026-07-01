class Solution {
    public int[] getSneakyNumbers(int[] nums) {
        Set<Integer> seen = new HashSet<>();
        int[] res = new int[2];
        int idx = 0;
        for (int x : nums) {
            if (!seen.add(x)) {
                res[idx++] = x;
            }
        }
        return res;
    }
}
