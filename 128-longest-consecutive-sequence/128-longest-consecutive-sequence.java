class Solution {
    public int longestConsecutive(int[] nums) {
        
        HashSet<Integer> input = new HashSet<>();

        int longestStreak = 0, currentStreak = 0;

        for (int num : nums) {
            input.add(num);
        }

        for (Integer value : input) {
            if(!input.contains(value - 1)){
                currentStreak = 1;
                value += 1;
                while(input.contains(value)){
                    currentStreak++;
                    value++;
                }
                longestStreak = Math.max(longestStreak, currentStreak);
            }
        }

        return longestStreak;
        
    }
}