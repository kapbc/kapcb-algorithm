package com.kapcb.ccc.algorithm.sort;


import com.kapcb.ccc.algorithm.logarithm.Logarithm;

/**
 * <a>Title: SelectionSort </a>
 * <a>Author: Kapcb <a>
 * <a>Description: SelectionSort <a>
 *
 * @author Kapcb
 * @version 1.0
 * @date 2022/2/20 17:26
 * @since 1.0
 */
public class SelectionSort {

    private SelectionSort() {
    }

    private static void doSelectionSort(int[] arr) {
        if (arr == null || arr.length < 2) {
            return;
        }
        // 0 ~ N-1
        for (int i = 0; i < arr.length - 1; i++) {
            int minIndex = i;
            // i ~ N-1 上找最小下标
            for (int j = i + 1; j < arr.length; j++) {
                minIndex = arr[j] < arr[minIndex] ? j : minIndex;
            }
            swap(arr, i, minIndex);
        }
    }

    private static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    public static void main(String[] args) {
        int testTime = 5000;
        int maxSize = 20;
        int maxValue = 100;
        boolean result = true;
        for (int i = 0; i < testTime; i++) {
            int[] arrOne = Logarithm.generateRandomArray(maxSize, maxValue);
            int[] arrTwo = Logarithm.copyArray(arrOne);

            doSelectionSort(arrOne);
            Logarithm.comparator(arrTwo);

            if (!Logarithm.isEqual(arrOne, arrTwo)) {
                result = false;
                break;
            }
        }
        System.out.println(result ? "Nice" : "Fucking");
    }

}
