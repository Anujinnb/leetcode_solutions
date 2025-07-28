class Solution:
    def combinationSum(self, candidates: List[int], target: int) -> List[List[int]]:
        result = []
        sum_list = []

        def backtrack(i, current_sum):
            if current_sum == target:
                result.append(sum_list[:])
                return
            
            if current_sum > target or i == len(candidates):
                return

            backtrack(i + 1, current_sum)

            sum_list.append(candidates[i])
            backtrack(i, current_sum + candidates[i])

            sum_list.pop()
        
        backtrack(0, 0)

        return result