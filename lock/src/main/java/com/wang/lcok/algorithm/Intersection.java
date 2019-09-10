package com.wang.lcok.algorithm;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Intersection {
    /**
     * 求交集
     *
     * @param args
     */
    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 2, 3};
        int[] nums2 = {2, 2, 3};
        List test = test(nums, nums2);
        test.stream()
                .forEach(System.out::println);
    }

    public static List test(int[] nums, int[] nums2) {
        Arrays.sort(nums);
        Arrays.sort(nums2);
        int p1 = 0;
        int p2 = 0;
        List<Integer> list = new ArrayList<>();
        while (p1 < nums.length && p2 < nums2.length) {
            if (nums[p1] < nums2[p2]) {
                p1++;
            } else if (nums[p1] > nums2[p2]) {
                p2++;
            } else {
                list.add(nums[p1]);
                p1++;
                p2++;
            }
        }
        return list;
    }
}
