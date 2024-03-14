from solution import Solution

# Test cases for bruteforce_search
def test_bruteforce_search():
    sol = Solution()
    assert sol.bruteforce_search([-1, 0, 3, 5, 9, 12], 9) == 4
    assert sol.bruteforce_search([-1, 0, 3, 5, 9, 12], 2) == -1
    assert sol.bruteforce_search([], 5) == -1
    print("Bruteforce solution test cases passed successfully!")

# Test cases for binary_search
def test_binary_search():
    sol = Solution()
    assert sol.bruteforce_search([-1, 0, 3, 5, 9, 12], 9) == 4
    assert sol.bruteforce_search([-1, 0, 3, 5, 9, 12], 2) == -1
    assert sol.bruteforce_search([], 5) == -1
    print("Binary search solution test cases passed successfully!")

if __name__ == "__main__":
    test_bruteforce_search()
    test_binary_search()
    print("All test cases passed!")
