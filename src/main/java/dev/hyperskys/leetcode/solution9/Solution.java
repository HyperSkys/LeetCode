package dev.hyperskys.leetcode.solution9;

public class Solution {
    public boolean isPalindrome(int x) {
        String str = String.valueOf(x);
        char[] ch = str.toCharArray();
        int s = 0, e = ch.length-1;

        while (s <= e){
            if (ch[s++] != ch[e--]) return false;
        }

        return true;
    }

    public static void main(String[] args) {
        Solution s = new Solution();
        System.out.println(s.isPalindrome(121));
    }
}
