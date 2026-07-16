class Solution {
    public String[] findWords(String[] words) {
        List<String> res = new ArrayList<>();

        String a = "QWERTYUIOPqwertyuiop";
        String b = "ASDFGHJKLasdfghjkl";
        String c = "ZXCVBNMzxcvbnm";
        for (int i = 0; i < words.length; i++) {
            boolean in1 = true, in2 = true, in3 = true;

            for (int j = 0; j < words[i].length(); j++) {
                char ch = words[i].charAt(j);
                if (a.indexOf(ch) < 0) in1 = false;
                if (b.indexOf(ch) < 0) in2 = false;
                if (c.indexOf(ch) < 0) in3 = false;
            }

            if (in1 || in2 || in3) res.add(words[i]);
        }

        return res.toArray(new String[0]);


    }
}