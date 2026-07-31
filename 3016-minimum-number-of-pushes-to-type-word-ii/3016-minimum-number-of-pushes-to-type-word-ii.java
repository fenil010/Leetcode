class Solution {
    public int minimumPushes(String word) {
        int[] cnt = new int[26];
        for (char c : word.toCharArray()) cnt[c - 'a']++;
        Integer[] arr = new Integer[26];
        for (int i = 0; i < 26; i++) arr[i] = cnt[i];
        Arrays.sort(arr, Collections.reverseOrder());
        int total = 0;
        for (int i = 0; i < 26; i++)
            total += arr[i] * (i / 8 + 1);
        return total;
    }
}
