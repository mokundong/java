package com.mkd.sort;

/**
 * Created by MKD on 2017/3/30.
 */
class Bubble {
    public static void main(String[] args){
        outArr(bubblesotr(new int[] {4,2,6,8,3,4,6,2,9,3,6}));
    }
    public static int[] bubblesotr(int[] arr){
        //大数下沉
        for(int i=0;i<arr.length;i++){
            int index = 0;
            int tmp = 0;
            for(int j=0;j<arr.length-1;j++){
                if(arr[j] > arr[j+1]){
                    tmp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = tmp;
                }
            }
        }
        return arr;
    }
    public static void outArr(int[] arr){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i] + " ");
        }
    }
}
