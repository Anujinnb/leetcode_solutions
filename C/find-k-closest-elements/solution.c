int *findClosestElements(int *arr, int arrSize, int k, int x, int *returnSize)
{
    int low = 0;
    int high = arrSize - 1;

    while (high - low >= k)
    {
        if (abs(arr[low] - x) > abs(arr[high] - x))
        {
            low++;
        }
        else
        {
            high--;
        }
    }

    int *result = (int *)malloc(k * sizeof(int));
    *returnSize = k;

    int index = 0;
    for (int i = low; i <= high; i++)
    {
        result[index++] = arr[i];
    }

    return result;
}