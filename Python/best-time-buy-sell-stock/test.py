from solution import Solution

def run_test_cases():
    # Test Case 1
    prices = [7, 1, 5, 3, 6, 4]
    assert Solution().maxProfit(prices) == 5

    # Test Case 2
    prices = [7, 6, 4, 3, 1]
    assert Solution().maxProfit(prices) == 0

    # Test Case 3
    prices = [1, 2, 3, 4, 5]
    assert Solution().maxProfit(prices) == 4

    # Test Case 4
    prices = [5, 4, 3, 2, 1]
    assert Solution().maxProfit(prices) == 0

    # Test Case 5
    prices = [3, 3, 3, 3, 3]
    assert Solution().maxProfit(prices) == 0

    # Test Case 6
    prices = [3, 1, 4, 8, 2, 6]
    assert Solution().maxProfit(prices) == 7

    # Test Case 7
    prices = [5, 5, 5, 5, 5]
    assert Solution().maxProfit(prices) == 0

    # Test Case 8
    prices = [3, 3, 3, 3, 3, 3]
    assert Solution().maxProfit(prices) == 0

    # Test Case 9
    prices = [5, 4, 2, 7, 1, 6]
    assert Solution().maxProfit(prices) == 5

    # Test Case 10
    prices = [1, 3, 6, 4, 2, 8]
    assert Solution().maxProfit(prices) == 7

    # Test Case 11
    prices = [2, 5, 1, 4, 7, 3, 6, 8]
    assert Solution().maxProfit(prices) == 7

    # Test Case 12
    prices = [2, 2, 2, 2, 2]
    assert Solution().maxProfit(prices) == 0

    print("All test cases passed successfully!")


if __name__ == "__main__":
    run_test_cases()