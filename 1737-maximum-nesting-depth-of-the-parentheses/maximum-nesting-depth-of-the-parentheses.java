class Solution {
    public int maxDepth(String s) {
        int cdepth=0; int depth=0;
        for(char c:s.toCharArray()){
            if(c=='('){
                cdepth++;
            }
            if(c==')'){
                cdepth--;
            }
            depth=Math.max(depth,cdepth);
        }
        return depth;
    }
}