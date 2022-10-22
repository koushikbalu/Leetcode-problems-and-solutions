class Solution {
    public int removeDuplicates(int[] nums) {
                int insertIndex = 0, i = 1;

        while(i < nums.length){
            if(nums[i] != nums[i - 1]){
                nums[insertIndex] = nums[i - 1];
                insertIndex++;
            }
            i++;
        }
        nums[insertIndex] = nums[i - 1];
        
        return insertIndex + 1;
    }
}