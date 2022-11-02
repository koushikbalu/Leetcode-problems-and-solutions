class Solution {
    public int maxArea(int[] height) {
        
        int left_pointer = 0;
        int right_pointer = height.length - 1;
        int distance, min_height, max_volume = 0, temp;

        while (left_pointer < right_pointer){
            distance = right_pointer - left_pointer;
            min_height = Math.min(height[right_pointer], height[left_pointer]);
            temp = min_height*distance;
            max_volume = Math.max(max_volume, temp);

            if(height[right_pointer] > height[left_pointer]){
                left_pointer++;
            } else if(height[left_pointer] > height[right_pointer]){
                right_pointer--;
            } else {
                left_pointer++;
                right_pointer--;
            }
        }
        return max_volume;
        
    }
}