//Time complexity: O(n^3) because it iterates through the loop 3 times, which will take n^3
//Space complexity: O(n^3) because hashset stores triplet elements during the nested loops. In worst case, there could be O(n^3) unique triplets
//The solution below is not the optimal one.

class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);
        HashSet<List<Integer>> result = new HashSet<>();

        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                for (int k = j + 1; k < nums.length; k++) {
                    if (nums[i] + nums[j] + nums[k] == 0) {
                        List<Integer> temp = Arrays.asList(nums[i], nums[j], nums[k]);
                        result.add(temp);
                    }
                }
            }
        }
        return new ArrayList<>(result);
    }
}