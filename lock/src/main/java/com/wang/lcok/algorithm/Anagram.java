package com.wang.lcok.algorithm;

import java.util.Arrays;

public class Anagram {
    /**
     * 有效的字母异位词
     *
     * @param args
     */
    public static void main(String[] args) {

    }

    public boolean isAnagram(String s, String t) {
        if (s == null || t == null) {
            return false;
        }
        if (s.length() != t.length()) {
            return false;
        }
        char[] chars = s.toCharArray();
        char[] chars1 = t.toCharArray();
        Arrays.sort(chars);
        Arrays.sort(chars1);

        for (int i = 0; i < chars.length; i++) {
            if (chars[i] != chars1[i]) {
                return false;
            }
        }
        return true;
    }
}
