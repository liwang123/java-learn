package com.wang.lcok.algorithm;

/**
 * 统计第一次不重复的字母
 */
public class FirstUniqChar {

    public static void main(String[] args) {
        System.out.println(firstUniqChar("leetcode"));
    }

    public static int firstUniqChar(String s) {
        int res = -1;
        //遍历a到z
        for (char ch = 'a'; ch <= 'z'; ch++) {
            int index = s.indexOf(ch);
            if (index != -1 && index == s.lastIndexOf(ch)) {
                //取最小的index
                if (res == -1 || res > index) {
                    res = index;
                }
            }
        }
        return res;
    }
}
