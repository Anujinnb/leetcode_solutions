int uniquePaths(int m, int n)
{
    int *row = (int *)malloc(n * sizeof(int));

    for (int i = 0; i < n; i++)
    {
        row[i] = 1;
    }

    for (int i = 0; i < m - 1; i++)
    {
        int *newRow = (int *)malloc(n * sizeof(int));
        newRow[n - 1] = 1;

        for (int j = n - 2; j >= 0; j--)
        {
            newRow[j] = newRow[j + 1] + row[j];
        }

        row = newRow;
    }

    return row[0];
}