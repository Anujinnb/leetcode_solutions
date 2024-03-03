class Solution {
    public int countKDifference(int[] nums, int k) {
        int count = 0;
        HashMap<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            int difference = nums[i] - k;

            if (map.containsKey(difference)) {
                count += map.get(difference);
            }

            if (map.containsKey(nums[i] + k)) {
                count += map.get(nums[i] + k);
            }

            map.put(nums[i], map.getOrDefault(nums[i], 0) + 1);
        }

        return count;
    }
}
