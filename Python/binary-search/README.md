# Binary Search

This problem contains 3 important points.

## Solution

I included two solutions for this problem.

### Brute force

First, we go through the array and if any number in the array equals to the target, then we return the index of that number. Otherwise, we just return -1.

### Binary search

First, we take the first index of the whole list (left) and the last index of the list (right). In this way, we can divide the whole list into half, which will reduce the runtime complexity. Since this is already sorted, if the target number is smaller than number at middle index of the list, then we search the lower half of the list. If the target is bigger than the number at middle index, then we search the upper half of the list. If target equals the number at middle index, we can simply return that index.

## Time and space complexity

### Time complexity

1. Brute force time complexity is O(logn).

### Space complexity

The space complexity of this code is O(1) because the amount of space used by the algorithm is constant. We need constant space to store result.

## Test cases

There are overall 12 test cases for this algorithm. If the algorithm passes all 12 test cases, it will display "All test cases passed successfully"
