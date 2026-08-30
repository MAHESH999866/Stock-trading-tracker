class Solution {
    public int minimumDeletions(int[] nums) {
       int n = nums.length;
       int min = 0;
       int max = 0;
       for(int i=0;i<n;i++){
        if(nums[i]<nums[min]) min = i;
        if(nums[i]>nums[max]) max = i;}
        int way1 = Math.max(min, max)+1;
        int way2 = n - Math.min(min, max);
        int way3 = (Math.min(min, max)+1)+(n - Math.max(min, max));
        
       
       return Math.min(way1, Math.min(way2,way3));
    }
}