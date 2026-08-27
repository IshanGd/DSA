class Solution {
    public int maxArea(int[] height) {
        int max=0,lp=0,rp=height.length-1;
        while(lp<rp){
            int w=rp-lp;
            int ht=Math.min(height[lp],height[rp]);
            int water=w*ht;
            max=Math.max(max,water);
            if(height[lp]<height[rp])
            lp++;
            else
            rp--;
        }
        return max;
    }
}