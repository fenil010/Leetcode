class Solution {
    public String convert(String s, int numRows) {
        if(numRows==1) return s;


        int n = s.length();
        int jumps = (numRows-1)*2;

        StringBuilder res = new StringBuilder();


        for(int i = 0 ;i<numRows;i++){
            int downJump=jumps-(2*i);
            int upJump=2*i;

            int j = i;                 
            boolean down = true;     

            while(j < n){
                res.append(s.charAt(j));

                if(i == 0 || i == numRows-1){
                    j += jumps;        
                } else {
                    j += down ? downJump : upJump;
                    down = !down;  
                }
            }
        }
        return res.toString();
        }
}