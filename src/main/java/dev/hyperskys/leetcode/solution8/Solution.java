package dev.hyperskys.leetcode.solution8;

public class Solution {
    public int myAtoi(String str) {
        if(str == null) return 0;
        str = str.trim();
        if(str.length() < 1) return 0;

        boolean isNeg = false;
        int i = 0;
        if(str.charAt(0) == '-') {
            isNeg = true;
            i++;
        } else if(str.charAt(0) == '+') {
            i++;
        }

        double result = 0;
        while(i < str.length() && str.charAt(i) >= '0' && str.charAt(i) <= '9') {
            result = result*10 + (str.charAt(i) - '0');
            i++;
        }

        if(isNeg) result = -result;
        if (result > Integer.MAX_VALUE) return Integer.MAX_VALUE;
        if (result < Integer.MIN_VALUE) return Integer.MIN_VALUE;

        return (int) result;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.myAtoi("0032"));
    }
}
