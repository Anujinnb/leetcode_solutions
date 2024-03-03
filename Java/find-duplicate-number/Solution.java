//Explanation for the code: Using hashmap, I was able to achieve time complexity of O(n). If the element exists in the
//hashmap, then we know that there is already duplication so we can just return that element. Otherwise, we insert that element
//in the hashmap with the count of 1, which indicates that there is no duplication yet.

class Solution {
    public int findDuplicate(int[] nums) {
        HashMap<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            if (map.containsKey(nums[i])) {
                return nums[i];
            } else {
                map.put(nums[i], 1);
            }
        }

        return 0;
    }
}