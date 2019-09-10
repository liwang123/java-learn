package com.wang.lcok.algorithm;

import java.util.HashMap;
import java.util.Map;

public class TwoSum {
    /**
     * 两数之和
     *
     * @param args
     */
    public static void main(String[] args) {
        Map<Integer, Integer> map1 = new HashMap<Integer, Integer>();
        int[] nums = {2, 7, 11, 15, 3, 6};
        int target = 9;
        towSum(nums, target, map1);
        for (Map.Entry<Integer, Integer> entry :
                map1.entrySet()) {
            System.out.println(entry.getKey() + ":" + entry.getValue());
        }

    }

    public static void towSum(int[] nums, int target, Map map1) {
        if (nums.length <= 1) {
            return;
        }
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            if (map.containsKey(target - nums[i])) {
                map1.put(map.get(target - nums[i]), i);
            } else {
                map.put(nums[i], i);
            }
        }
    }
}
