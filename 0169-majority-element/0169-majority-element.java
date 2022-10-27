class Solution {
    public int majorityElement(int[] nums) {
        int currentMajority = 0, count = 0;

        for (int num : nums) {
            if(count == 0){
                currentMajority = num;
            }

            count += (currentMajority == num)? 1 : -1;
            
        }

        return currentMajority;
    }
}