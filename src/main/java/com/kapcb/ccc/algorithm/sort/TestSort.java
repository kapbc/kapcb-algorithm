package com.kapcb.ccc.algorithm.sort;

/**
 * <a>Title: TestSort </a>
 * <a>Author: Kapcb <a>
 * <a>Description: TestSort <a>
 *
 * @author Kapcb
 * @version 1.0
 * @date 2022/2/20 21:45
 * @since 1.0
 */
public class TestSort {

    private static void bubbleSort(int[] arr) {
        if (arr == null || arr.length < 2) {
            return;
        }

        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (arr[i] > arr[j + 1]) {
                    swap(arr, i, j + 1);
                }
            }
        }
    }

    private static void selectionSort(int[] arr) {
        if (arr == null || arr.length < 2) {
            return;
        }

        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            int minIndex = 0;
            for (int j = i + 1; j < n; j++) {
                minIndex = arr[j] < arr[minIndex] ? j : minIndex;
            }
            swap(arr, i, minIndex);
        }
    }

    private static void swap(int[] arr, int i, int j) {
        arr[i] = arr[i] ^ arr[j];
        arr[j] = arr[i] ^ arr[j];
        arr[i] = arr[i] ^ arr[j];
    }

}
