# Find Minimum in Rotated Sorted Array

This problem contains 2 solutions. It is important to consider brute-force solution before reaching the conclusion

## Brute Force

### Explanation

Since the array is rotated sorted, we can compare each number in the array with minimum value. If that number is the minimum number, then we find the number.

### Time and Space Complexity

Time Complexity: O(n). The Brute-force solution is the expensive one because it has to go through the whole array and do comparison to find the minimum value.

Space Complexity: O(1). The algorithm requires constant space.

## Binary Search

### Explanation

By dividing the whole array into half (lower half of the array and upper half of the array), we can search the minimum. If the number at the last index is lower than the number at middle index, we know we have to search the upper half of the array to search for minimum. Otherwise, we search the lower half of the array to search for minimum. Then, we compare the minimum value and element at middle index

### Time and Space Complexity
