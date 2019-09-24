package com.wang.lcok.algorithm;

/**
 * 反转整数
 */
public class ReverInteger {
    public static void main(String[] args) {
        int sum = 0;
        int x = -120;
        while (x != 0) {
            int y = x % 10;
            if (sum < Integer.MIN_VALUE / 10 || sum > Integer.MAX_VALUE / 10) {
                return;
            }
            sum = y + sum * 10;
            x = x / 10;
        }
        System.out.println(sum);
    }
}
