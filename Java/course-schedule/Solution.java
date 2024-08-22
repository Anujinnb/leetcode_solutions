//This solution used Topological Sorting (Kahn's algorithm). 
//1. The time complexity of this algorithm is O(V + E), where V is the number of courses and E is number of prerequisite dependencies.
//2. The space complexity is also O(V + E)

class Solution {
    public boolean canFinish(int numCourses, int[][] prerequisites) {
        int[] indegree = new int[numCourses];
        List<List<Integer>> adj = new ArrayList<>();

        for (int i = 0; i < numCourses; i++) {
            adj.add(new ArrayList<>());
        }

        for (int[] prerequisite : prerequisites) {
            int src = prerequisite[1];
            int dest = prerequisite[0];
            indegree[dest]++;
            adj.get(src).add(dest);
        }

        Queue<Integer> q = new LinkedList<>();
        for (int i = 0; i < numCourses; i++) {
            if (indegree[i] == 0) {
                q.add(i);
            }
        }

        while (!q.isEmpty()) {
            int node = q.poll();
            for (int neighbor : adj.get(node)) {
                indegree[neighbor]--;
                if (indegree[neighbor] == 0) {
                    q.add(neighbor);
                }
            }
        }

        for (int i : indegree) {
            if (i != 0) {
                return false;
            }
        }

        return true;
    }
}