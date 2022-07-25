package com.kapcb.ccc.algorithm;

/**
 * <a>Title: PrintBinary </a>
 * <a>Author: Kapcb <a>
 * <a>Description: PrintBinary <a>
 *
 * @author Kapcb
 * @version 1.0
 * @date 2022/7/25 9:48 PM
 * @since 1.0
 */
public class PrintBinary {

    private static void printBinary(int num) {
        for (int i = 31; i >= 0; i--) {
            System.out.print((num & (1 << i)) == 0 ? "0" : "1");
        }
        System.out.println();
    }

    /**
     * 打印 int 整形数的二进制
     *
     * @param args
     */
    public static void main(String[] args) {
        printBinary(10);
    }

}
