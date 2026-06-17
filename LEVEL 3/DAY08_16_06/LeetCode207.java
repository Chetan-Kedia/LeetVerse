import java.util.*;

class Solution {
    public boolean canFinish(int numCourses, int[][] prerequisites) {

        ArrayList<Integer>[] graph = new ArrayList[numCourses];

        for (int i = 0; i < numCourses; i++) {
            graph[i] = new ArrayList<>();
        }

        for (int[] p : prerequisites) {
            graph[p[0]].add(p[1]);
        }

        for (int course = 0; course < numCourses; course++) {
            boolean[] path = new boolean[numCourses];

            if (!canTake(course, graph, path)) {
                return false;
            }
        }

        return true;
    }

    private boolean canTake(int course, ArrayList<Integer>[] graph, boolean[] path) {

        if (path[course]) {
            return false; // cycle detected
        }

        path[course] = true;

        for (int pre : graph[course]) {
            if (!canTake(pre, graph, path)) {
                return false;
            }
        }

        path[course] = false;

        return true;
    }
}
