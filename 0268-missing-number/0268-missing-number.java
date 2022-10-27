class Solution {
    public int missingNumber(int[] nums) {
        
        int sum = 0, totalSum, n = nums.length;
        totalSum = n * (n + 1)/2;

        for (int i : nums) {
            sum += i;
        }

        return totalSum - sum;
        
    }
}