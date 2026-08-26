class Solution {
    public int maxProduct(int[] nums) {
        if(nums==null||nums.length==0) return 0;
        int globalMax = nums[0];
        int currMax = nums[0];
        int currMin = nums[0];
       for(int i=1;i<nums.length;i++){
        int num = nums[i];//loops for the taking values
        if(num<0){ //if its negetive values
            int temp = currMax;
            currMax = currMin;
            currMin = temp;
        }
        currMax = Math.max(num, currMax*num);
        currMin = Math.min(num, currMin*num);
        globalMax = Math.max(globalMax, currMax);
       }
       return globalMax;
        }
    }
