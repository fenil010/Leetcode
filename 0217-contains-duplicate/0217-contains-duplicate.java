class Solution {
    public boolean containsDuplicate(int[] nums) {
        HashSet<Integer> has1 = new HashSet<>();
        for (int i : nums) {
            if (has1.contains(i)) {
                return true;
            }
            has1.add(i);
        }
        return false;
    }
}
