class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        
        Set<List<Integer>> set = new HashSet<>();
        
        int len = nums.length, sum = 0, j = 0, k = 0;
        
        Arrays.sort(nums);
        
        for(int i = 0; i < len - 2; i++){
            
         
            
            sum = 0 - nums[i];
            j = i + 1;
            k = len - 1;
            
            while(j < k){
                if(sum == nums[j] + nums[k]){
                    set.add(Arrays.asList(nums[i], nums[j], nums[k]));
                    j++;
                    k--;
                } else if (nums[j] + nums[k] > sum){
                    k--;
                } else {
                    j++;
                }
            }
            
        }
        
        return new ArrayList<>(set);
        
    }
}