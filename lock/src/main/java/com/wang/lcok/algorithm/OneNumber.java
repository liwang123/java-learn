package com.wang.lcok.algorithm;

public class OneNumber {
    /**
     * 只出现一次数字
     *
     * @param args
     */
    public static void main(String[] args) {
        int[] nums = {2, 2, 1, 4, 4};
        int result = 0;
        for (int i = 0; i < nums.length; i++) {
            result = result ^ nums[i];
        }
        System.out.println(5 ^ 4);
    }
}
