class Solution {
    public String countAndSay(int n) {
        String s ="1";

        for(int i =1;i<n;i++){
            StringBuilder sb = new StringBuilder();
            int j = 0;

                while(j<s.length()){
                    char digit = s.charAt(j);
                    int count=0;

                    while(j<s.length() && s.charAt(j)==digit){
                        count++;
                        j++;
                    }

                    sb.append(count);
                    sb.append(digit);
                }
            s =sb.toString();
        }

        return s;

    }
}