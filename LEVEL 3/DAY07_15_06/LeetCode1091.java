import java.util.*;

class Solution {
    public int shortestPathBinaryMatrix(int[][] grid) {
        int n = grid.length;

        // If start or end is blocked
        if (grid[0][0] != 0 || grid[n - 1][n - 1] != 0) {
            return -1;
        }

        // Directions (8 possible moves)
        int[][] dir = {
            {1, 0}, {0, 1}, {-1, 0}, {0, -1},
            {1, 1}, {1, -1}, {-1, 1}, {-1, -1}
        };

        Queue<int[]> q = new ArrayDeque<>();
        q.offer(new int[]{0, 0});
        grid[0][0] = 1; // mark visited

        int pathLength = 1;

        while (!q.isEmpty()) {
            int size = q.size();

            for (int i = 0; i < size; i++) {
                int[] cell = q.poll();
                int r = cell[0], c = cell[1];

                // Reached destination
                if (r == n - 1 && c == n - 1) {
                    return pathLength;
                }

                for (int[] d : dir) {
                    int nr = r + d[0];
                    int nc = c + d[1];

                    if (nr >= 0 && nc >= 0 && nr < n && nc < n && grid[nr][nc] == 0) {
                        q.offer(new int[]{nr, nc});
                        grid[nr][nc] = 1; // mark visited
                    }
                }
            }

            pathLength++;
        }

        return -1;
    }
}
