class Solution {
    public int findGCD(int[] nums) {
        int mn = nums[0], mx = nums[0];
        for (int n : nums) {
            mn = Math.min(mn, n);
            mx = Math.max(mx, n);
        }
        while (mn != 0) {
            int temp = mx % mn;
            mx = mn;
            mn = temp;
        }
        return mx;
    }
}
