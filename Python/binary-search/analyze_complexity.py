import time
import sys
from solution import Solution

def analyze_complexity():
    sol = Solution()

    # Test case for bruteforce_search
    nums = [1, 2, 3, 4, 5]
    target = 3
    start_time = time.time()
    index = sol.bruteforce_search(nums, target)
    end_time = time.time()
    elapsed_time = end_time - start_time
    space_complexity = sys.getsizeof(index)
    print(f"Bruteforce Search, Elapsed Time: {elapsed_time} seconds, Space Complexity: {space_complexity} bytes")

    # Test case for binary_search
    nums = [1, 2, 3, 4, 5]
    target = 3
    start_time = time.time()
    index = sol.binary_search(nums, target)
    end_time = time.time()
    elapsed_time = end_time - start_time
    space_complexity = sys.getsizeof(index)
    print(f"Binary Search, Elapsed Time: {elapsed_time} seconds, Space Complexity: {space_complexity} bytes")

if __name__ == "__main__":
    analyze_complexity()
