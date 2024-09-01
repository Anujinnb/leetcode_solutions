//This also uses hashset and sorting algorithm.

class Solution {
    public int longestConsecutive(int[] nums) {
        int count = 1;
        int result = 1;

        if (nums.length == 0) {
            return 0;
        }

        HashSet<Integer> set = new HashSet<>();

        for (int num : nums) {
            set.add(num);
        }

        ArrayList<Integer> arr_list = new ArrayList<>(set);
        Collections.sort(arr_list);

        for (int i = 0; i < arr_list.size() - 1; i++) {
            if (arr_list.get(i + 1) - arr_list.get(i) == 1) {
                count++;
            } else {
                count = 1;
            }

            result = Math.max(count, result);
        }

        return result;
    }
}
