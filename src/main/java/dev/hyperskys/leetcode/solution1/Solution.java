package dev.hyperskys.leetcode.solution1;

import java.util.HashMap;

public class Solution {
    public int[] twoSum(int[] numbers, int target) {
        HashMap<Integer,Integer> indexMap = new HashMap<>();
        for(int i = 0; i < numbers.length; i++){
            Integer requiredNum = (Integer)(target - numbers[i]);
            if(indexMap.containsKey(requiredNum)) return new int[]{indexMap.get(requiredNum), i};
            indexMap.put(numbers[i], i);
        }

        return null;
    }

    public static void main(String[] args) {
        Solution s = new Solution();
        int[] numbers = new int[]{2, 7, 11, 15};
        int target = 9;
        int[] result = s.twoSum(numbers, target);
        System.out.println(result[0] + " " + result[1]);
    }
}
