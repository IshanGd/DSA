class Solution {
    public int searchInsert(int[] nums, int target) {
        int k=0;
        if(target<=nums[0]){
            return 0;
        }
        else if(target>nums[nums.length-1]){
            return nums.length;
        }
        else {
            for(int i=0;i<nums.length-1;i++){
                if(target>nums[i] && target<=nums[i+1]){
                    k=i;
                    break;
                }
            }
            return k+1;
        }
    }
}