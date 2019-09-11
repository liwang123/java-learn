package com.wang.lcok.algorithm;

public class ReverseString {
    /**
     * 反转字符串
     *
     * @param args
     */
    public static void main(String[] args) {
        char[] num = {'h', 'e', 'l', 'l', 'o'};
        reverseString(num);
    }

    public static void reverseString(char[] s) {
        int end = s.length;
        int half = end / 2;
        end = end - 1;
        for (int i = 0; i < half && end >= 0; ++i, --end) {
            s[i] ^= s[end];
            System.out.println("1" + s[i]);
            s[end] ^= s[i];
            System.out.println("2" + s[end]);
            s[i] ^= s[end];
            System.out.println("3" + s[i]);
        }
    }
}
