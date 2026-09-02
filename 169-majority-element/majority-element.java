class Solution {
    public int majorityElement(int[] nums) {
        int el=nums[0],ct=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]==el)
            ct++;
            else
            ct--;
            if(ct==0)
            el=nums[i+1];
        }
        return el;
    }
}
