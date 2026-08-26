class Solution {
    public List<Integer> findAnagrams(String s, String p) {
        List<Integer> result = new ArrayList<>();
        int window = p.length();

        if (window > s.length()) {
            return result;
        }

        int[] counts = new int[26];
        for (int i = 0; i < window; i++) {
            counts[p.charAt(i) - 'a']++;
            counts[s.charAt(i) - 'a']--;
        }

        if (allZero(counts)) {
            result.add(0);
        }

        for (int right = window; right < s.length(); right++) {
            counts[s.charAt(right) - 'a']--;
            counts[s.charAt(right - window) - 'a']++;

            if (allZero(counts)) {
                result.add(right - window + 1);
            }
        }

        return result;
    }

    private boolean allZero(int[] counts) {
        for (int count : counts) {
            if (count != 0) {
                return false;
            }
        }
        return true;
    }
}