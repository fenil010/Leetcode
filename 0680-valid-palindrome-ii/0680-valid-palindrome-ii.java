class Solution {
    private boolean isPalindrome(String s , int i, int j ){
        while(i<j){
            if(s.charAt(i) != s.charAt(j)) return false;
            i++;
            j--;
        
    }
        return true;


    }

    public boolean validPalindrome(String s) {
        int i = 0;
        int j = s.length()-1;
        int count=1;

        while(i<j){
            if(s.charAt(i) != s.charAt(j)){
                if(count>0){
                    count--;

                    return isPalindrome(s,i+1,j) || isPalindrome(s,i,j-1);
                }
                else{
                return false;
                }

            }
            i++;
            j--;
        }

        return true;
    }
}