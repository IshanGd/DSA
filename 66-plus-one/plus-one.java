import java.util.ArrayList;
class Solution {
    public int[] plusOne(int[] digits) {
        int n=digits.length;
        ArrayList<Integer> list = new ArrayList<>(digits.length);
        for(int i=0;i<n;i++){
            list.add(digits[i]);
        }
        list.set(n-1,digits[n-1]+1);
        for(int i=digits.length-1;i>0;i--){
            if(list.get(i)==10){
                list.set(i-1,digits[i-1]+1);
                list.set(i,0);
            }
        }
        if(list.get(0)==10){
            list.set(0,0);
            list.add(0,1);
        }
        int[] intArray = new int[list.size()];
        for (int i = 0; i < list.size(); i++) {
            intArray[i] = list.get(i);
        }
        return intArray;
    }
 }
