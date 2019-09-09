package com.wang.lcok.algorithm;

public class Stock {
    /**
     * 买卖股票
     * @param args
     */
    public static void main(String[] args) {
        int[] nums={7,1,5,3,6,4};
        int i = maxProfit(nums);
        System.out.println(i);
    }

    public static int maxProfit(int[] nums){
        if(nums.length<2)return 0;
        int sum=0;
        for(int i=0;i<nums.length-1;i++){
            if(nums[i]<nums[i+1]){
                sum+=nums[i+1]-nums[i];
            }
            else {continue;}
        }
        return sum;
    }
}
