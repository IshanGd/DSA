class Solution {
    public boolean isPalindrome(int x) {
        int cpy=x;
        int s=0;
        while(cpy>0){
            int r=cpy%10;
            cpy=cpy/10;
            s=(s*10)+r;
        }
        if(x>=0){
            if(s==x){
                return true;
            }
            else{
                return false;
            }
        }
        else{
            return false;
        }
    }
}