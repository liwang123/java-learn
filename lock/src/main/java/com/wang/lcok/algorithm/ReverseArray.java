package com.wang.lcok.algorithm;

public class ReverseArray {
    /**
     * 反转数组
     *
     * @param args
     */
    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 4, 5, 6, 7};
        reverse(nums, 3);
        for (int s :
                nums) {
            System.out.println(s);
        }
    }

    public static void reverse(int[] nums, int k) {
        if (nums.length < 2 || k < 1 || k % nums.length == 0) {
            return;
        }
        if (k > nums.length) {
            k = k % nums.length;
        }
        reserverArray(nums, 0, nums.length - 1 - k);
        reserverArray(nums, nums.length - k, nums.length - 1);
        reserverArray(nums, 0, nums.length - 1);

    }

    public static void reserverArray(int[] nums, int start, int end) {
        while (start < end) {
            int temp = nums[start];
            nums[start++] = nums[end];
            nums[end--] = temp;
        }
    }
}
