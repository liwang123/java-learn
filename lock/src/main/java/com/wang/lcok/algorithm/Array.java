package com.wang.lcok.algorithm;

public class Array {
    /**
     * 去除有序数组中重复元素
     * @param args
     */
    public static void main(String[] args) {
        int [] nums={1,2,2,3,4,4,5,5,6,6};
        int j = removeDuplicates(nums);
        System.out.println(j);
        int temp=nums.length-j;
        for(int i=0;i<nums.length-temp;i++){
            System.out.println(nums[i]);
        }

    }
    public static int removeDuplicates(int nums[]){
        int k=1;
        for(int i=0;i<nums.length-1;i++){
            if(nums[i]!=nums[i+1]){
                nums[k]=nums[i+1];
                k++;
            }
        }
        return k;
    }
}
