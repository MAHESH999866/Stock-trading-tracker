class Solution {
    public int[] twoSum(int[] number, int target) {
        int i=0;int j= number.length-1;

       while(i<j){
        int CurrSum = number[i]+number[j];
        if(CurrSum>target){
            j--;
        }else if(CurrSum<target)    {
            i++;
        }else{
            return new int[]{i+1,j+1};
        }
       }
       return new int[]{};
    }
}