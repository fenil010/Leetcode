class Solution {
    public String decodeMessage(String key, String message) {
        char[] table = new char[26];
        char next = 'a';
        for (int i = 0; i < key.length(); i++) {
            char c = key.charAt(i);
            if (c != ' ' && table[c - 'a'] == 0) {
                table[c - 'a'] = next++;
            }
        }
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < message.length(); i++) {
            char c = message.charAt(i);
            if(c==' '){
                sb.append(' ');
            }
            else{
            sb.append(table[c - 'a']);
            }
        }
        return sb.toString();
    }
}
