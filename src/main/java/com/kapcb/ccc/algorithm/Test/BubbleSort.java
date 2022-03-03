package com.kapcb.ccc.algorithm.Test;

import com.kapcb.ccc.algorithm.logarithm.Logarithm;

/**
 * <a>Title: BubbleSort </a>
 * <a>Author: Kapcb <a>
 * <a>Description: BubbleSort <a>
 *
 * @author Kapcb
 * @version 1.0
 * @date 2022/3/3 21:18
 * @since 1.0
 */
public class BubbleSort {

    public static int[] doBubbleSort(int[] arr) {
        if (arr == null || arr.length < 2) {
            return arr;
        }

        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    swap(arr, j, j + 1);
                }
            }
        }
        return arr;
    }

    private static void swap(int[] arr, int i, int j) {
        arr[i] = arr[i] ^ arr[j];
        arr[j] = arr[i] ^ arr[j];
        arr[i] = arr[i] ^ arr[j];
    }

    public static void main(String[] args) {
        int testTime = 500;
        int maxSize = 50;
        int maxValue = 500;
        boolean success = true;
        for (int i = 0; i < testTime; i++) {
            int[] arrOne = Logarithm.generateRandomArray(maxSize, maxValue);
            int[] arrTwo = Logarithm.copyArray(arrOne);

            doBubbleSort(arrOne);
            Logarithm.comparator(arrTwo);
            if (!Logarithm.isEqual(arrOne, arrTwo)) {
                // print array
                success = false;
                break;
            }
        }
        System.out.println(success ? "Nice" : "Fail");
    }
}
