package dev.hyperskys.leetcode.solution2360;

import java.util.HashMap;

public class Solution {
    public int longestCycle(int[] edges) {
        int res = -1;
        boolean[] vis = new boolean[edges.length];

        for(int i=0; i<edges.length; i++){
            if (vis[i]) continue;
            HashMap<Integer, Integer> x = new HashMap<>();
            for (int idx = i, dist = 0; idx != -1; idx = edges[idx]){
                if(x.containsKey(idx)) {
                    res = Math.max(res, dist-x.get(idx));
                    break;
                }

                if(vis[idx]) break;
                vis[idx] = true;
                x.put(idx, dist++);
            }
        }

        return res;
    }

    public static void main(String[] args) {
        Solution s = new Solution();
        int[] edges = {0,3,1,4,2};
        System.out.println(s.longestCycle(edges));
    }
}
