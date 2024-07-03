class Solution {
    double val;
    public void dfs(Map<String, List<Pair<String, Double>>> adj, String src, String dst, double curVal, Set<String> visited) {
        if (src.equals(dst)) {
            val = curVal;
            return;
        }
        visited.add(src);
        for (Pair<String, Double> p : adj.get(src)){
            if (!visited.contains(p.getKey())) {
                dfs(adj, p.getKey(), dst, curVal*p.getValue(), visited); 
            }
        }
    }
    
    public double[] calcEquation(List<List<String>> equations, double[] values, List<List<String>> queries) {
        int n = equations.size();
        Map<String, List<Pair<String, Double>>> adj = new HashMap<>();
        for (int i = 0 ; i < n ; i++) {
            List<String> eq = equations.get(i);
            String u = eq.get(0);
            String v = eq.get(1);
            double w = values[i];
            adj.putIfAbsent(u, new ArrayList<>());
            adj.get(u).add(new Pair(v, w)); 
            adj.putIfAbsent(v, new ArrayList<>());
            adj.get(v).add(new Pair(u, 1/w)); 
        }
        int m = queries.size();
        double[] ans = new double[m];
        for (int i = 0 ; i < m ; i++) {
            String u = queries.get(i).get(0);
            String v = queries.get(i).get(1);
            if (!adj.containsKey(u)) {
                ans[i] = -1;
                continue;
            }
            val = -1;
            dfs(adj, u, v, 1, new HashSet<>());
            ans[i] = val;
        }
        return ans;
    }
}