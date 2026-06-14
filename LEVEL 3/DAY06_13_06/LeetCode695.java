class Solution {

    public int dfs(int[][] grid, int i, int j) {
        // Base case: out of bounds or water
        if (i < 0 || j < 0 || i >= grid.length || j >= grid[0].length || grid[i][j] == 0) {
            return 0;
        }

        // Mark as visited
        grid[i][j] = 0;

        int count = 1;

        // Explore all 4 directions
        count += dfs(grid, i + 1, j); // down
        count += dfs(grid, i - 1, j); // up
        count += dfs(grid, i, j + 1); // right
        count += dfs(grid, i, j - 1); // left

        return count;
    }

    public int maxAreaOfIsland(int[][] grid) {
        int maxArea = 0;

        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[0].length; j++) {
                if (grid[i][j] == 1) {
                    int area = dfs(grid, i, j);
                    maxArea = Math.max(maxArea, area);
                }
            }
        }

        return maxArea;
    }
}
