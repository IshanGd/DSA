class Solution {
    public String removeOuterParentheses(String s) {
        StringBuilder ans=new StringBuilder();
        int depth=0;
        for (char c:s.toCharArray()) {
            if(c=='(' && depth++>0){
                ans.append(c);
            }
            if(c==')' && depth-->1){
                ans.append(c);
            }
        } 
        return ans.toString(); 
    }
}