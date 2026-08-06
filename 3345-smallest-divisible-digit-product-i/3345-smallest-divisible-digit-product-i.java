class Solution {
    public int smallestNumber(int n, int t) {
        int n1 = n;
        
        while(true){
            int tmp = n1;
            int mul = 1;
            while(tmp>0){
                mul*=tmp%10;
                tmp/=10;
            }

            if(mul%t==0){
                return n1;
            }

            n1++;
        }
    }
}