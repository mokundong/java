package com.mkd.sort;

/**
 * Created by MKD on 2017/3/30.
 */
class Insertdemo {
    public static void main(String[] args){
        outArr(insertdemo(new int[] {4,2,6,8,3,4,6,2,9,3,6}));
    }
    public static int[] insertdemo(int[] arr){
        for(int i=0;i<arr.length;i++){
            for(int j=i;j>0;j--){
                int tmp = 0;
                if(arr[j]<arr[j-1]){
                    tmp = arr[j-1];
                    arr[j-1] = arr[j];
                    arr[j] = tmp;
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
