class Solution {
    public int numOfSubarrays(int[] arr, int k, int threshold) {
        int sum =0;
        int target = k*threshold;

         for (int i = 0; i < k; i++) {
            sum += arr[i];
        }

        int count = 0;
        if (sum >= target) {
            count++;  
        }

        for(int right =k ;right<arr.length;right++){
            sum+=arr[right]-arr[right-k];
            if(sum>=target){
                count++;
            }


        }
        return count;
    }
}