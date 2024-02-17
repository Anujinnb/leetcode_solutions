//Explanation for the code: we loop through the array. The current element plus next element (sum)
//is added to the set if it is not present in the hashset. !set.add(sum) -- this checks whether the sum is already
//present in the hashset. Since hashset doesn't allow duplicates, if the sum already exists in the set, then we found the
//equal sum. So, we can return true.

class Solution {
    public boolean findSubarrays(int[] nums) {
        HashSet<Integer> set = new HashSet<>();
        int sum = 0;

        for (int i = 0; i < nums.length - 1; i++) {
            sum = nums[i] + nums[i + 1];

            if (!set.add(sum)) {
                return true;
            }
        }

        return false;
    }
}