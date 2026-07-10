class Solution {
    public String restoreString(String s, int[] indices) {
        char[] chars = s.toCharArray();
        char[] res = new char[s.length()];

        for(int i = 0;i<s.length();i++){
            res[indices[i]]=chars[i];
        }
        return new String(res);
    }
}