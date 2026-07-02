class Solution {
    public int countPairs(List<Integer> nums, int target) {
        int left = 0;
        int right = nums.size()-1;
        int count=0;

        while(left<right){
            int sum = nums.get(left)+nums.get(right);

            if(sum < target){
                count++;
            }
                left++;

            if(left == right){
                left=0;
                right--;
            }


        }

        return count;
    }
}