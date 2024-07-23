// main.c
#include <stdio.h>
#include "solution.h"

int main()
{
    int nums1[6] = {1, 2, 3, 0, 0, 0};
    int nums2[3] = {2, 5, 6};
    int m = 3;
    int n = 3;
    merge(nums1, 6, m, nums2, 3, n);
    for (int i = 0; i < 6; i++)
    {
        printf("%d ", nums1[i]);
    }
    printf("\n");
    return 0;
}
