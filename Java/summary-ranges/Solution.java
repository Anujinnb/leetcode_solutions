class Solution {
    public List<String> summaryRanges(int[] nums) {
        List<String> result = new ArrayList<>();
        int start = 0;

        while (start < nums.length) {
            int end = start;

            while (end + 1 < nums.length && nums[end + 1] == nums[end] + 1) {
                end++;
            }

            if (nums[end] == nums[start]) {
                result.add(String.valueOf(nums[start]));
            } else {
                result.add(nums[start] + "->" + nums[end]);
            }

            start = end + 1;
        }

        return result;
    }
}