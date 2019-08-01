package com.wang.lcok.arithmetic;

public class BubbleSort {
    public static void main(String[] args) {

        int[] arr={2,6,3,0,4};
        bubbleSort(arr);
        result(arr);
    }

    static void bubbleSort(int[] arr){
      for(int end=arr.length-1;end>0;end--){
          boolean flag=true;
          for(int i=0;i<end;i++){
              if(arr[i]>arr[i+1]){
                  swap(arr,i,i+1);
                  flag=false;
              }
          }
          if(flag)break;
      }
    }

    static void swap(int[] arr,int a,int b){
        int temp=arr[a];
        arr[a]=arr[b];
        arr[b]=temp;
    }

    static void result(int[] arr){
        for(int i=0;i<arr.length;i++){
            System.out.println(arr[i]);
        }
    }
}
