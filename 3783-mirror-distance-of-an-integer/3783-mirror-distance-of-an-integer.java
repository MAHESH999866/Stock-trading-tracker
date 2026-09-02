class Solution {
    public int mirrorDistance(int n) {
        int rev = 0;
        int num = n; //storing original data for later use
        
        while(n>0){
            int rem  = n % 10;   //taking last digit 
             rev = rev * 10 + rem;  //rev logic
            n = n/10;    //taking first digit

        }
    int ans = Math.abs(num-rev); return ans;
    }
}