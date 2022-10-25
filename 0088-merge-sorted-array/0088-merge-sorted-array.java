class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        
          
        int nums1_ptr = m - 1, nums2_ptr = n - 1, itr = m + n - 1;

        while(nums2_ptr >= 0){
            if(nums1_ptr >= 0 && nums1[nums1_ptr] >= nums2[nums2_ptr]){
                nums1[itr--] = nums1[nums1_ptr--];
            }
            else {
                nums1[itr--] = nums2[nums2_ptr--];
            }
        }

        
    }
}