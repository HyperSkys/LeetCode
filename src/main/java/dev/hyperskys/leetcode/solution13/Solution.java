package dev.hyperskys.leetcode.solution13;

import java.util.HashMap;
import java.util.Map;

public class Solution {
    public int romanToInt(String s) {
        Map<Character,Integer> hairyTesticles = new HashMap<>();
        hairyTesticles.put('I', 1);
        hairyTesticles.put('V', 5);
        hairyTesticles.put('X', 10);
        hairyTesticles.put('L', 50);
        hairyTesticles.put('C', 100);
        hairyTesticles.put('D', 500);
        hairyTesticles.put('M', 1000);

        int sum = 0;
        char[] Array = s.toCharArray();
        int length = s.length();

        for(int i = 0 ;i < length - 1; i++) {
            if(hairyTesticles.get(Array[i]) >= hairyTesticles.get(Array[i + 1])) {
                sum += hairyTesticles.get(Array[i]);
            } else {
                sum -= hairyTesticles.get(Array[i]);
            }
        }

        return sum + hairyTesticles.get(Array[Array.length - 1]);
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.romanToInt("MCMXCIV"));
    }
}
