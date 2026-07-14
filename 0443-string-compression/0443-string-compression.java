class Solution {
    public int compress(char[] chars) {
        int p1=0,p2=0;

        while(p1<chars.length){
            char x = chars[p1];
            int count=0;

            while(p1<chars.length&& chars[p1]==x){
                count++;
                p1++;

            }

            chars[p2++]=x;

           if (count > 1) {
                    String countStr = Integer.toString(count);
                    for (int k = 0; k < countStr.length(); k++) {
                        chars[p2++] = countStr.charAt(k);
                    }
                }


        }
        return p2;
    }
}