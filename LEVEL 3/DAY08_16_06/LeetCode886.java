import java.util.*;

class Solution {
    public boolean possibleBipartition(int n, int[][] dislikes) {

        ArrayList<ArrayList<Integer>> graph = new ArrayList<>();

        for (int i = 0; i <= n; i++) {
            graph.add(new ArrayList<>());
        }

        for (int[] d : dislikes) {
            int u = d[0];
            int v = d[1];

            graph.get(u).add(v);
            graph.get(v).add(u);
        }

        int[] color = new int[n + 1];

        for (int i = 1; i <= n; i++) {

            if (color[i] != 0) continue;

            Queue<Integer> q = new LinkedList<>();
            q.offer(i);
            color[i] = 1;

            while (!q.isEmpty()) {

                int curr = q.poll();

                for (int next : graph.get(curr)) {

                    if (color[next] == 0) {
                        color[next] = -color[curr];
                        q.offer(next);
                    } 
                    else if (color[next] == color[curr]) {
                        return false;
                    }
                }
            }
        }

        return true;
    }
}
