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

Time Complexity: O(nlogn) (Since we used sorting algorithm, it should be nlogn. It is little faster than bruteforce algorithm.)
Space Complexity: O(1)

### 3. Hashset

Hashset doesn't allow duplicates. So, we can simply loop through the array and if the element doesn't exist in the hashset, then we can add it to the hashset. If the element already exists in the hashset, then we can return True.

Time Complexity: O(n) (We loop through the array once)
Space Complexity: O(n) (where n is the number of elements in the input list nums. If the element doesn't exist in the array, we keep adding, which is adding to the space)

### 4. Hashmap

We loop through the array and if the element doesn't exist in the hashmap, then we add to the hashmap with two values (key and value). If the value already exists in hashmap, then return true.

Time Complexity: O(n) (We loop through the array once)
Space Complexity: O(n) (where n is the number of elements in the input list nums. If the element doesn't exist in the array, we keep adding, which is adding to the space)

### Conclusion

If we use bruteforce algorithm, it will obviously increase the runtime complexity, but lower space complexity. If we use hashset and hashmap, it will take lower runtime complexity, but higher space complexity. So, in compensation for decreasing the runtime complexity, we use higher space complexity.
