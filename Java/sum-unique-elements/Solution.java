//Explanation for the code below: First, we need to iterate through the array. If hashmap contains the number,
//then we need to store the number with the number of occurrences. If hashmap doesn't, then
//we need to store the number with 1 (because it occurs for the first time). Then using map.entry, we can get
//key and value of the elements in the hashmap. Finally, we need to get the sum of the numbers which occurs just once.
//Otherwise, we can ignore it.

class Solution {
    public int sumOfUnique(int[] nums) {
        int sum = 0;
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
                sum += entry.getKey();
            }
        }

        return sum;
    }
}