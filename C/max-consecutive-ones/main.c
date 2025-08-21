#include <stdio.h>
#include "solution.h"

int main()
{
    int nums1[] = {1, 1, 0, 1, 1, 1};
    int size1 = sizeof(nums1) / sizeof(nums1[0]);
    printf("Test 1 result: %d (Expected: 3)\n", findMaxConsecutiveOnes(nums1, size1));

    int nums2[] = {1, 0, 1, 1, 0, 1};
    int size2 = sizeof(nums2) / sizeof(nums2[0]);
    printf("Test 2 result: %d (Expected: 2)\n", findMaxConsecutiveOnes(nums2, size2));

    int nums3[] = {0, 0, 0};
    int size3 = sizeof(nums3) / sizeof(nums3[0]);
    printf("Test 3 result: %d (Expected: 0)\n", findMaxConsecutiveOnes(nums3, size3));

    int nums4[] = {1, 1, 1, 1, 1};
    int size4 = sizeof(nums4) / sizeof(nums4[0]);
    printf("Test 4 result: %d (Expected: 5)\n", findMaxConsecutiveOnes(nums4, size4));

    return 0;
}
