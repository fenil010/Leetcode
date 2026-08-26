class Solution {
    public int maxFreqSum(String s) {
        int[] count = new int[26];
        for (char c : s.toCharArray()) {
            count[c - 'a']++;
        }

        String vowels = "aeiou";
        int maxVowel = 0, maxConsonant = 0;

        for (int i = 0; i < 26; i++) {
            char c = (char) ('a' + i);
            if (vowels.indexOf(c) != -1) {
                maxVowel = Math.max(maxVowel, count[i]);
            } else {
                maxConsonant = Math.max(maxConsonant, count[i]);
            }
        }

        return maxVowel + maxConsonant;
    }
}
