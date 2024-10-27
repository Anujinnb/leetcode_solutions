#include <stdio.h>
#include <stdlib.h>
#include <math.h>
#include "solution.h" // Including the solution.h header file

// Function definition for finding k closest elements to x
int *findClosestElements(int *arr, int arrSize, int k, int x, int *resultSize)
{
    int start = 0;
    int end = arrSize - 1;

    // Shrink the window to have exactly k elements
    while (end - start >= k)
    {
        if (abs(arr[start] - x) > abs(arr[end] - x))
        {
            start++;
        }
        else
        {
            end--;
        }
    }

    // Allocate memory for the result array
    int *result = (int *)malloc(k * sizeof(int));
    *resultSize = k;

    // Copy the closest k elements to the result array
    int index = 0;
    for (int i = start; i <= end; i++)
    {
        result[index++] = arr[i];
    }

    return result;
}

int main()
{
    int arr[] = {2, 4, 5, 6, 9}; // Input array
    int arrSize = sizeof(arr) / sizeof(arr[0]);
    int k = 3;      // Number of closest elements
    int x = 6;      // Target value
    int resultSize; // Size of the result array

    // Call the function to get the k closest elements
    int *result = findClosestElements(arr, arrSize, k, x, &resultSize);

    // Print the result
    printf("The closest %d elements to %d are: ", k, x);
    for (int i = 0; i < resultSize; i++)
    {
        printf("%d ", result[i]);
    }
    printf("\n");

    // Free the allocated memory
    free(result);

    return 0;
}
