class Solution {

    public int networkDelayTime(int[][] times, int n, int k) {

        int INF = Integer.MAX_VALUE / 2;

        int[][] graph = new int[n + 1][n + 1];

        for (int[] row : graph)

            Arrays.fill(row, INF);

        for (int[] edge : times) {

            graph[edge[0]][edge[1]] = edge[2];

        }

        int[] dist = new int[n + 1];

        Arrays.fill(dist, INF);

        boolean[] visited = new boolean[n + 1];

        dist[k] = 0;

        for (int i = 1; i <= n; i++) {        // n rounds

            int u = -1;

            for (int j = 1; j <= n; j++) {    // linear scan for min

                if (!visited[j] &&

                    (u == -1 || dist[j] < dist[u])) {

                    u = j;

                }

            }

            if (dist[u] == INF) break;         // remaining unreachable

            visited[u] = true;

            for (int v = 1; v <= n; v++) {     // relax all neighbors

                if (dist[v] > dist[u] + graph[u][v]) {

                    dist[v] = dist[u] + graph[u][v];

                }

            }

        }

        int ans = 0;

        for (int i = 1; i <= n; i++) {

            if (dist[i] >= INF) return -1;

            ans = Math.max(ans, dist[i]);

        }

        return ans;

    }

}
