import java.util.*;
import java.util.Arrays;
class Solution {
    public int longestConsecutive(int[] nums) {
        int longest=1;
        int n = nums.length;
        if(n==0) return 0;
        Set<Integer> st = new HashSet<>();
        for (int i = 0; i < n; i++) {
            st.add(nums[i]);
        }
        for(int i:st){
            if(!st.contains(i-1)){
                int cnt=1;
                int x=i;
                while(st.contains(x+1)){
                    cnt++;
                    x++;
                }
                 longest=Math.max(longest,cnt);
            }
        }
        return longest;
    }
}