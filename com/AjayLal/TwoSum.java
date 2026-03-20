package com.AjayLal;

import java.util.HashMap;

class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> hash = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {

            int remaining_residue = target - nums[i];

            if (hash.containsKey(remaining_residue)) {
                return new int[] {
                        hash.get(remaining_residue), i
                };
            }

            hash.put(nums[i], i);

        }

        return new int[] {
                -1, -1
        };
    }
}

public class TwoSum {

    public static void main(String arhs[]) {
        int array[] = { 2, 7, 11, 15 };

        int Target = 9;

        Solution sc = new Solution();
        int result[] = sc.twoSum(array, Target);

        System.out.println(result[0] + " " + result[1]);

    }
}
