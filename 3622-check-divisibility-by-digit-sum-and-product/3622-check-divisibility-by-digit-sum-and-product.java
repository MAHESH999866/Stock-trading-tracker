class Solution {
    public boolean checkDivisibility(int n) {
        int temp = n;
        int sum = 0;
        int product = 1;
        while(temp>0){
            int val = temp % 10;
            sum += val;
            product *= val;
            temp /= 10;
        }
        int total = sum + product;
        return n % total==0;
    }
}