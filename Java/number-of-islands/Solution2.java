//This solution includes recursive approach for DFS
//1. Time complexity: The time complexity of this algorithm is O(m * n), where m is the number of rows and n is the number of columns in the grid.
//The DFS takes O(1) time per cell, so each cell is visited at most twice.
//2. Space complexity: In the worst case, if there is a single large island covering the entire grid, the recursion stack will grow to a depth of O(m * n).

class Solution {
    public int numIslands(char[][] grid) {
        int islands = 0;

        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[0].length; j++) {
                if (grid[i][j] == '1') {
                    dfs(grid, i, j);
                    islands++;
                }
            }
        }

        return islands;
    }

    public void dfs(char[][] grid, int i, int j) {
        if (i < 0 || j < 0 || i >= grid.length || j >= grid[0].length || grid[i][j] == '0') {
            return;
        }

        grid[i][j] = '0';
        dfs(grid, i + 1, j);
        dfs(grid, i, j + 1);
        dfs(grid, i - 1, j);
        dfs(grid, i, j - 1);
    }
}