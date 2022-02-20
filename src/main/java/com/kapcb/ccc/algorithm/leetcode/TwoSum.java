package com.kapcb.ccc.algorithm.leetcode;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/**
 * <a>Title: TwoSum </a>
 * <a>Author: Kapcb <a>
 * <a>Description: TwoSum <a>
 *
 * @author Kapcb
 * @version 1.0
 * @date 2022/2/20 16:12
 * @since 1.0
 */
public class TwoSum {

    /**
     * 两数之和:
     * https://leetcode-cn.com/problems/two-sum/
     */
    private TwoSum() {
    }

    /**
     * 时间复杂度 O(n)
     *
     * @param nums   int[]
     * @param target int[]
     * @return int[]
     */
    private static int[] doTwoSumByMap(int[] nums, int target) {
        Map<Integer, Integer> numMap = new HashMap<>(2 << 1);
        for (int i = 0; i < nums.length; i++) {
            if (numMap.containsKey(target - nums[i])) {
                return new int[]{numMap.get(target - nums[i]), i};
            }
            numMap.put(nums[i], i);
        }
        return new int[0];
    }

    private static int[] doTwoSumByBruteForce(int[] nums, int target) {
        int n = nums.length;

        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                if (nums[i] + nums[j] == target) {
                    return new int[]{i, j};
                }
            }
        }
        return new int[0];
    }

    public static void main(String[] args) {
        int[] nums = new int[]{2, 7, 11, 15};
        int target = 9;
        int[] resultByMap = doTwoSumByMap(nums, target);
        System.out.println("result by map : " + Arrays.toString(resultByMap));


        int[] resultByBruteForce = doTwoSumByBruteForce(nums, target);
        System.out.println("result by brute force : " + Arrays.toString(resultByBruteForce));
    }

}
