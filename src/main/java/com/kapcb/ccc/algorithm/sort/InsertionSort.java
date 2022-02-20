package com.kapcb.ccc.algorithm.sort;

import java.util.Arrays;

/**
 * <a>Title: InsertionSort </a>
 * <a>Author: Kapcb <a>
 * <a>Description: InsertionSort <a>
 *
 * @author Kapcb
 * @version 1.0
 * @date 2022/2/20 17:26
 * @since 1.0
 */
public class InsertionSort {

    private InsertionSort() {
    }

    private static void doInsertionSort(int[] nums) {
        if (nums == null || nums.length < 2) {
            return;
        }
        // 保证 0 ~ i 有序
        for (int i = 1; i < nums.length; i++) {
            for (int j = i - 1; j >= 0 && nums[j] > nums[j + 1]; j--) {
                swap(nums, j, j + 1);
            }
        }
        System.out.println(Arrays.toString(nums));
    }

    private static void swap(int[] nums, int i, int j) {
        nums[i] = nums[i] ^ nums[j];
        nums[j] = nums[i] ^ nums[j];
        nums[i] = nums[i] ^ nums[j];
    }

    private static void comparator(int[] nums) {
        Arrays.sort(nums);
        System.out.println(Arrays.toString(nums));
    }

    public static void main(String[] args) {
        int[] array = new int[]{1, 4, 3, 2, 5, 3, 6, 4, 7, 2, 4};
        doInsertionSort(array);
        comparator(array);
    }

}
