package com.kapcb.ccc.algorithm.sort;

import java.util.Arrays;

/**
 * <a>Title: ChooseSort </a>
 * <a>Author: Kapcb <a>
 * <a>Description: ChooseSort <a>
 *
 * @author Kapcb
 * @version 1.0
 * @date 2022/2/20 17:26
 * @since 1.0
 */
public class ChooseSort {

    private ChooseSort() {
    }

    private static void comparator(int[] nums) {
        Arrays.sort(nums);
        System.out.println(Arrays.toString(nums));
    }

}
