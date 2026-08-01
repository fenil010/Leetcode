class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);
        int n = nums.length;
        List<List<Integer>> res = new ArrayList<>();

        for (int i = 0; i < n - 2; i++) {

            if (i > 0 && nums[i] == nums[i - 1]) continue;
         
            if (nums[i] > 0) break;

            int lo = i + 1, hi = n - 1;
            while (lo < hi) {
                int total = nums[i] + nums[lo] + nums[hi];
                if (total < 0) {
                    lo++;
                } else if (total > 0) {
                    hi--;
                } else {
                    res.add(Arrays.asList(nums[i], nums[lo], nums[hi]));
                    lo++;
                    hi--;
                    while (lo < hi && nums[lo] == nums[lo - 1]) lo++;
                    while (lo < hi && nums[hi] == nums[hi + 1]) hi--;
                }
            }
        }
        return res;
    }
}
