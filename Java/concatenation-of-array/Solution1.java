class Solution {
    public int[] getConcatenation(int[] nums) {
        int[] new_array = new int[nums.length*2];

        for (int i = 0; i < nums.length; i++) {
            new_array[i] = nums[i];
            new_array[i + nums.length] = nums[i];
        }

        return new_array;
    }
}