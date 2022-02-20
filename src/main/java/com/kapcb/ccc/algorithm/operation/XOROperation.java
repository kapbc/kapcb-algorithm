package com.kapcb.ccc.algorithm.operation;

/**
 * <a>Title: XOROperation </a>
 * <a>Author: Kapcb <a>
 * <a>Description: XOROperation <a>
 *
 * @author Kapcb
 * @version 1.0
 * @date 2022/2/20 12:04
 * @since 1.0
 */
public class XOROperation {

    /**
     * 异或运算
     * 无进制位相加: 相同为1, 不同为0
     *
     * @param args String[]
     */
    public static void main(String[] args) {
        int a = 5;
        int b = 7;

        a = a ^ b;
        b = a ^ b;
        a = a ^ b;
        System.out.println("a is : " + a + ", b is : " + b);
    }

}
