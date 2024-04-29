class Solution {
    public int countHillValley(int[] nums) {
        int count = 0;
        int right = 0;
        
        for (int i = 1; i < nums.length - 1; i++) {
            if (nums[i] != nums[i - 1]) {
                right = i + 1; 

                while (right < nums.length && nums[i] == nums[right]) {
                    right++;
                }

                if (right < nums.length && ((nums[i] > nums[i - 1] && nums[i] > nums[right]) || 
                                            (nums[i] < nums[i - 1] && nums[i] < nums[right]))) {
                    count++;
                }
            } 
        }
        
        return count;
    }
}
