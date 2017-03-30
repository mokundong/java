package com.mkd.sort;

/**
 * Created by MKD on 2017/3/30.
 */
class SelectDemo {
    public static void main(String[] args){
    outArr(sort(new int[] {4,2,6,8,3,4,6,2,9,3,6}));
    }
    public static int[] sort(int[] arr){
        for(int i=0;i<arr.length;i++){
            int min = Integer.MAX_VALUE;
            int index = 0;
            for(int j=i+1;j<arr.length;j++){
                if(min>arr[j]){
                    min = arr[j];
                    index = j;
                }
            }
            int change = 0;
            if(arr[i]>min){
                change = arr[i];
                arr[i] = arr[index];
                arr[index] = change;
            }
        }
        return arr;
    }
    public static void outArr(int[] arr){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
}
