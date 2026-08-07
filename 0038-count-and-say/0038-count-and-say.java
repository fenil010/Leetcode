class Solution {
    public String countAndSay(int n) {
        String result = "1";
        for (int k = 1; k < n; k++) {
            StringBuilder next = new StringBuilder();
            int i = 0;
            while (i < result.length()) {
                char digit = result.charAt(i);
                int count = 0;
                while (i < result.length() && result.charAt(i) == digit) {
                    count++;
                    i++;
                }
                next.append(count).append(digit);
            }
            result = next.toString();
        }
        return result;
    }
}