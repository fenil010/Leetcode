class Solution {
    public long sumAndMultiply(int n) {
        long sum =0;
        long num = 0,res=0;

        while( n>0){
            int x = n%10;
            if(x!=0){
                sum+=x;
                num = num*10 +x;
            }
            n=n/10;
        }

        while( num >0){
            long n1= num%10;
            res = res*10+n1;
            num/=10;
        }

        return res*sum;    
    }
}