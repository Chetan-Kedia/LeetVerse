class Solution {
    int[][] dirs = {{1,0}, {-1,0}, {0,1}, {0,-1}};
    int m, n;

    public List<List<Integer>> pacificAtlantic(int[][] heights) {
        m = heights.length;
        n = heights[0].length;

        boolean[][] pacific = new boolean[m][n];
        boolean[][] atlantic = new boolean[m][n];

        // Pacific: top row + left column
        for (int r = 0; r < m; r++) {
            dfs(r, 0, heights, pacific);
        }
        for (int c = 0; c < n; c++) {
            dfs(0, c, heights, pacific);
        }

        // Atlantic: bottom row + right column
        for (int r = 0; r < m; r++) {
            dfs(r, n - 1, heights, atlantic);
        }
        for (int c = 0; c < n; c++) {
            dfs(m - 1, c, heights, atlantic);
        }

        List<List<Integer>> ans = new ArrayList<>();

        for (int r = 0; r < m; r++) {
            for (int c = 0; c < n; c++) {
                if (pacific[r][c] && atlantic[r][c]) {
                    ans.add(Arrays.asList(r, c));
                }
            }
        }

        return ans;
    }

    private void dfs(int r, int c, int[][] heights, boolean[][] vis) {
        vis[r][c] = true;

        for (int[] d : dirs) {
            int nr = r + d[0];
            int nc = c + d[1];

            if (nr < 0 || nr >= m || nc < 0 || nc >= n)
                continue;

            if (vis[nr][nc])
                continue;

            // Move to equal or higher height (reverse flow)
            if (heights[nr][nc] >= heights[r][c]) {
                dfs(nr, nc, heights, vis);
            }
        }
    }
}
