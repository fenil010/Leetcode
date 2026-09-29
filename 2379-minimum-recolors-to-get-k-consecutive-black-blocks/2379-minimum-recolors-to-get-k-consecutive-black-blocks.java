class Solution {
    public int minimumRecolors(String blocks, int k) {
        int whiteCount = 0, minRecolors = Integer.MAX_VALUE;

        for (int i = 0; i < blocks.length(); i++) {
            if (blocks.charAt(i) == 'W') whiteCount++;   

            if (i >= k) {                              
                if (blocks.charAt(i - k) == 'W') whiteCount--;
            }

            if (i >= k - 1) {                          
                minRecolors = Math.min(minRecolors, whiteCount);
            }
        }
        return minRecolors;
    }
}