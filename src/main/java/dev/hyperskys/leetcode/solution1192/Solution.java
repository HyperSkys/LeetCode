package dev.hyperskys.leetcode.solution1192;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Solution {

    int time;

    public void dfs(List<List<Integer>> adj, int s, int par, int[] tin, int[] low, boolean[] vis, List<List<Integer>> list){
        vis[s] = true;
        tin[s] = low[s] = time++;
        for(int i: adj.get(s)) {
            if(i==par) continue;
            if(!vis[i]) {
                dfs(adj, i, s, tin, low, vis, list);
                low[s] = Math.min(low[s], low[i]);
                if (low[i]>tin[s]) list.add(Arrays.asList(s, i));
            } else {
                low[s] = Math.min(low[s], tin[i]);
            }
        }
    }

    public List<List<Integer>> criticalConnections(int n, List<List<Integer>> connections) {
        List<List<Integer>> adj = new ArrayList<>();
        for(int i=0;i<n;i++) adj.add(new ArrayList<>());
        for(List<Integer> ar: connections) {
            adj.get(ar.get(0)).add(ar.get(1));
            adj.get(ar.get(1)).add(ar.get(0));
        }

        boolean[] vis = new boolean[n];
        int[] tin = new int[n];
        int[] low = new int[n];
        List<List<Integer>> list = new ArrayList<>();

        for(int i=0;i<n;i++) {
            if(!vis[i]) dfs(adj, i, -1, tin, low, vis, list);
        }

        return list;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        List<List<Integer>> connections = new ArrayList<>();
        connections.add(Arrays.asList(0, 1));
        connections.add(Arrays.asList(1, 2));
        connections.add(Arrays.asList(2, 0));
        connections.add(Arrays.asList(1, 3));
        connections.add(Arrays.asList(3, 4));
        System.out.println(solution.criticalConnections(5, connections));
    }
}
