class Solution {
    public int maxSubArray(int[] arr) {
        
        int CurrMax = arr[0];
        int maxSoFar = arr[0];
        for(int i=1;i<arr.length;i++){
            CurrMax = Math.max(arr[i], CurrMax+arr[i]);
           
                maxSoFar = Math.max(maxSoFar, CurrMax);
            
        }
        return maxSoFar;
    }
}