class Solution {
    public String shortestBeautifulSubstring(String s, int k) {
        int n = s.length();
        String best = "";

        for (int i = 0; i < n; i++) {
            int ones = 0;
            for (int j = i; j < n; j++) {
                if (s.charAt(j) == '1') ones++;
                if (ones == k) {
                    String cand = s.substring(i, j + 1);
                    if (best.isEmpty()
                        || cand.length() < best.length()
                        || (cand.length() == best.length() && cand.compareTo(best) < 0)) {
                        best = cand;
                    }
                    break; 
                }
            }
        }
        return best;
    }
}
