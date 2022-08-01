package dev.hyperskys.leetcode.solution7;

public class Solution {
    public int reverse(int x) {
        int ans = 0;
        while(x != 0) {
            if((ans > Integer.MAX_VALUE / 10) || (ans < Integer.MIN_VALUE / 10)) return 0;
            int digit = x % 10;
            ans = (ans * 10) + digit;
            x = x/10;
        }
        return ans;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.reverse(123));
    }
}
