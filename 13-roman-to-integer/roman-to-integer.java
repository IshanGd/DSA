class Solution {
    public int romanToInt(String sc) {
        String ref="IVXLCDM";
        int[] val={1,5,10,50,100,500,1000};
        int sum=0;
        char[] s= sc.toCharArray();
        for(int i=0;i<s.length-1;i++){
            if(ref.indexOf(s[i])<ref.indexOf(s[i+1])){
                sum-=val[ref.indexOf(s[i])];
            }
            else{
                sum+=val[ref.indexOf(s[i])];
            }
        }
        sum+=val[ref.indexOf(s[s.length-1])];
        return sum;
    }
}