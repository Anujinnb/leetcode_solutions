# Best Time to Buy and Sell Stock

This problem contains 3 important points.

## Solution

First, we iterate through the prices array. If the price at each index is less than the minimum value, then that value becomes the minimum value. Otherwise, we need to compare the result and (price - minimum value). And we take the maximum value and store in the result.

## Time and space complexity

### Time complexity

The time complexity of this code is O(n), where n is the length of prices. The loop runs in linear time, which makes the overall complexity linear.

### Space complexity

The space complexity of this code is O(1) because the amount of space used by the algorithm is constant. We need constant space to store result.

## Test cases

There are overall 12 test cases for this algorithm. If the algorithm passes all 12 test cases, it will display "All test cases passed successfully"
