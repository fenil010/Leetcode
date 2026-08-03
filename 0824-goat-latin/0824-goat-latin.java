class Solution {
    public String toGoatLatin(String sentence) {
        String vowels = "aeiouAEIOU";
        String[] words = sentence.split(" ");
        String result = "";
        String extraA = "a";

        for (int i = 0; i < words.length; i++) {
            String word = words[i];

            if (vowels.indexOf(word.charAt(0)) == -1) {
                word = word.substring(1) + word.charAt(0);
            }

            word = word + "ma" + extraA;
            extraA = extraA + "a";

            if (i > 0) result = result + " ";
            result = result + word;
        }

        return result;
    }
}
