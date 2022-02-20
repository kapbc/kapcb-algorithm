package com.kapcb.ccc.algorithm.sort;

import java.util.Arrays;

/**
 * <a>Title: BubbleSort </a>
 * <a>Author: Kapcb <a>
 * <a>Description: BubbleSort <a>
 *
 * @author Kapcb
 * @version 1.0
 * @date 2022/2/20 12:03
 * @since 1.0
 */
public class BubbleSort {

    private BubbleSort() {
    }

    /**
     * 时间复杂度 O(n^2)
     *
     * @param array int[]
     */
    private static void doBubbleSort(int[] array) {
        if (array == null || array.length < 2) {
            return;
        }

        for (int i = 0; i < array.length - 1; i++) {
            for (int j = 0; j < array.length - i - 1; j++) {
                if (array[j] > array[j + 1]) {
                    swap(array, j, j + 1);
                }
            }
        }
        System.out.println(Arrays.toString(array));
    }

    private static void swap(int[] array, int big, int small) {
        array[big] = array[big] ^ array[small];
        array[small] = array[big] ^ array[small];
        array[big] = array[big] ^ array[small];
    }

    public static void main(String[] args) {



        int[] array = generateRandomArray(10);
        doBubbleSort(array);
        comparator(array);
    }

}
