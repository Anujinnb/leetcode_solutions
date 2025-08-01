class Solution {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> result = new ArrayList<>();
        List<Integer> sumList = new ArrayList<>();
        backtrack(candidates, target, 0, 0, sumList, result);
        return result;
    }

    private void backtrack(int[] candidates, int target, int i, int currentSum, 
                           List<Integer> sumList, List<List<Integer>> result) {
        if (currentSum == target) {
            result.add(new ArrayList<>(sumList));
            return;
        }

        if (currentSum > target || i == candidates.length) {
            return;
        }

        backtrack(candidates, target, i + 1, currentSum, sumList, result);

        sumList.add(candidates[i]);
        backtrack(candidates, target, i, currentSum + candidates[i], sumList, result);

        sumList.remove(sumList.size() - 1);
    }
}