# Contains Duplicate

This problem contains 3 important points.

## Solution, Time Complexity, Space Complexity

There are 4 solutions in total for this problem.

### 1. Brute-force

We loop through the array twice using the brute force algorithm. If the element at i index of outer loop equals the element at j index of inner loop, then we find the duplicate. Otherwise, we return false.

Time Complexity: O(n^2) (we loop through the array twice)
Space Complexity: O(1) (we don't use additional space)

### 2. Sort

We sort the array first. Since it is sorted, we just need to check the element at some index i and element at index i + 1. If these two equal to each other, then we can return true. Otherwise, it is false.

### 3. Hashset

### 4. Hashmap
