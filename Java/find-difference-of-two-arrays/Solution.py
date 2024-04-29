class Solution {
    public List<List<Integer>> findDifference(int[] nums1, int[] nums2) {
        Set<Integer> numsSet1 = new HashSet<>();
        Set<Integer> numsSet2 = new HashSet<>();
        Set<Integer> result1 = new HashSet<>();
        Set<Integer> result2 = new HashSet<>();

        for (int num : nums1) {
            numsSet1.add(num);
        }

        for (int num : nums2) {
            numsSet2.add(num);
        }

        for (int num : nums1) {
            if (!numsSet2.contains(num)) {
                result1.add(num);
            }
        }

        for (int num : nums2) {
            if (!numsSet1.contains(num)) {
                result2.add(num);
            }
        }

        List<List<Integer>> resultList = new ArrayList<>();
        resultList.add(new ArrayList<>(result1));
        resultList.add(new ArrayList<>(result2));

        return resultList;
    }
}