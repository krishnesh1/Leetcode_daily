// Last updated: 21/07/2026, 23:12:18
class Solution {

    public void dfs(List<List<Integer>> adj, int st, boolean[] vis) {

        vis[st] = true;

        for (int a : adj.get(st)) {
            if (!vis[a]) {
                dfs(adj, a, vis);
            }
        }
    }

    public int findCircleNum(int[][] isConnected) {

        int V = isConnected.length;
        List<List<Integer>> adj = new ArrayList<>();
        for (int i = 0; i < V; i++) {
            adj.add(new ArrayList<>());
        }

        // Convert adjacency matrix to adjacency list
        for (int i = 0; i < V; i++) {
            for (int j = i + 1; j < V; j++) {
                if (isConnected[i][j] == 1) {
                    adj.get(i).add(j);
                    adj.get(j).add(i);
                }
            }
        }

        boolean vis[] = new boolean[V];
        int cnt = 0;
        for (int i = 0; i < V; i++) {
            if (!vis[i]) {
                cnt++;
                dfs(adj, i, vis);
            }
        }

        return cnt;
    }
}