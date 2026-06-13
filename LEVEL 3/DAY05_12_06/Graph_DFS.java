public void dfsRecursive(int[][] graph, int node, boolean[] visited) {
    visited[node] = true;
    process(node); // visit / print

    for (int neighbor : graph[node]) {
        if (!visited[neighbor]) {
            dfsRecursive(graph, neighbor, visited);
        }
    }
}

//caller code
boolean[] visited = new boolean[graph.length];
dfsRecursive(graph, startNode, visited);
