class Solution {
    public List<String> findAndReplacePattern(String[] words, String pattern) {
        List<String> result = new ArrayList<>();
        String pFlat = createMapping(pattern);
        for (int i = 0; i < words.length; i++) {
            if (createMapping(words[i]).equals(pFlat)) {
                result.add(words[i]);
            }
        }
        return result;
    }

    private String createMapping(String s) {
        int[] map = new int[256];
        StringBuilder sb = new StringBuilder();
        int counter = 0;
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (map[c] == 0) {
                map[c] = ++counter;
            }
            sb.append(map[c]).append(',');
        }
        return sb.toString();
    }
}
