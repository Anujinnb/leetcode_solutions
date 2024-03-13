from solution import Solution
from typing import List

def run_test_cases():
    # Test Case 1
    nums: List[int] = [-1, 0, 3, 5, 9, 12]
    target: int = 9
    assert Solution().bruteforce_search(nums, target) == 4

    print("All test cases passed successfully!")