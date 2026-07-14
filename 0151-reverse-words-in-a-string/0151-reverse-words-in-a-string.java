class Solution {
    public String reverseWords(String s) {
        String[] words = s.trim().split("\\s+");  
        int p1 = 0;
        int p2 = words.length - 1;

        while (p1 < p2) {
            String temp = words[p1];
            words[p1] = words[p2];
            words[p2] = temp;
            p1++;
            p2--;
        }

        return String.join(" ", words);
    }
}
