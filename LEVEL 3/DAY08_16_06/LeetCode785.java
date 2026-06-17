import java.util.*;

class Solution {
    public boolean isBipartite(int[][] graph) {

        int n = graph.length;
        int[] color = new int[n]; // 0 = unvisited, 1 = red, -1 = blue

        for (int i = 0; i < n; i++) {

            if (color[i] != 0) continue;

            Queue<Integer> q = new LinkedList<>();
            q.offer(i);
            color[i] = 1;

            while (!q.isEmpty()) {

                int curr = q.poll();

                for (int neighbor : graph[curr]) {

                    if (color[neighbor] == 0) {
                        color[neighbor] = -color[curr];
                        q.offer(neighbor);
                    } 
                    else if (color[neighbor] == color[curr]) {
                        return false;
                    }
                }
            }
        }

        return true;
    }
}
