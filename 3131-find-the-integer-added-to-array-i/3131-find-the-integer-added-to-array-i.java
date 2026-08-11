import java.util.*;
class Solution {
    public int addedInteger(int[] nums1, int[] nums2) {
       int val1 = Integer.MAX_VALUE;
       int val2 = Integer.MAX_VALUE;
       for(int num : nums1){
        val1 = Math.min(val1, num);
       }
       for(int num : nums2){
        val2 = Math.min(val2, num);
       }
    return val2 - val1;
    }
}