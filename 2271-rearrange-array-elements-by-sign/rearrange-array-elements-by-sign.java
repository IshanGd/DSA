import java.util.ArrayList;
class Solution {
    public int[] rearrangeArray(int[] nums) {
        List<Integer> positive = new ArrayList<>();
        List<Integer> negative = new ArrayList<>();
        for(int i=0;i<nums.length;i++){
            if(nums[i]>0){
                positive.add(nums[i]);
            }
            else{
                negative.add(nums[i]);
            }
        }
        for(int i=0;i<nums.length-1;i=i+2){
            nums[i]=positive.get(i/2);
            nums[i+1]=negative.get(i/2);
        }
        return nums;
    }
}