package dev.hyperskys.leetcode.solution3;

import java.util.HashSet;

public class Solution {
    public int lengthOfLongestSubstring(String s) {
        HashSet<Character> set = new HashSet<>();
        int i = 0, count = 0, ans = 0;

        while(i < s.length()){
            if(!set.contains(s.charAt(i))) {
                set.add(s.charAt(i));
                count++;
                i++;
            } else {
                ans = Math.max(count,ans);
                set.clear();
                i = i + 1 - count;
                count = 0;
            }
        }

        return Math.max(ans, count);
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.lengthOfLongestSubstring("abcabcbb"));
        System.out.println(solution.lengthOfLongestSubstring("bbbbb"));
        System.out.println(solution.lengthOfLongestSubstring("pwwkew"));
    }
}
