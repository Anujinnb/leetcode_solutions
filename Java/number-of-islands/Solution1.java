//This solution contains iterative approach for DFS
//1. The time complexity of the solution is O(m * n) where m is number of rows and n is number of columns
//because the worst case is if we visited each cell in the grid.
//2. The space complexity of this program is O(m * n) because there are m * n cells in the grid. 

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
        Stack<int[]> stack = new Stack<>();
        stack.push(new int[]{i, j});

        int[][] directions = {{1, 0}, {0, 1}, {-1, 0}, {0, -1}};
        grid[i][j] = '0';

        while (!stack.isEmpty()) {
            int[] current = stack.pop();
            int row = current[0];
            int col = current[1];

            for (int[] dir : directions) {
                int newRow = row + dir[0];
                int newCol = col + dir[1];

                if (newRow >= 0 && newRow < grid.length && newCol >= 0 && newCol < grid[0].length && grid[newRow][newCol] == '1') {
                    grid[newRow][newCol] = '0';
                    stack.push(new int[]{newRow, newCol});
                }
            }
            
        } 
    }
}