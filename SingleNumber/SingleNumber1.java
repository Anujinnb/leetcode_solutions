//This code provides hashmap solution with runtime complexity of O(n). The space complexity for this code is also O(n).
//Explanation: First, we need to check whether the number in the nums array exists in the hashmap. If it exists, then we increment
//the count of occurrence alongside the number. Otherwise, we put the number and count of 1 (since its first occurrence) in the hashmap.
//Finally, using the entrySet, if the value (number of occurrence) equals to 1, then we find that single number in the array.

class Solution {
    public int singleNumber(int[] nums) {
        HashMap<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            if (map.containsKey(nums[i])) {
                map.put(nums[i], map.get(nums[i]) + 1);
            } else {
                map.put(nums[i], 1);
            }
        }

        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            if (entry.getValue() == 1) {
                return entry.getKey();
            }
        }

        return 0;
    }
}