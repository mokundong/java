package com.mkd.sort;

/**
 * Created by MKD on 2017/3/30.
 */
public class QuickDemo {
    public static void main(String[] args){
        outArr(quicksort(new int[] {4,2,6,8,3,4,6,2,9,3,6},0,10));
    }
    public static int[] quicksort(int[] arr,int start,int end){
        if (end - start<=0){
            return null;
        }
        int last = start;
        for(int i=start+1;i<=end;i++){
            if(arr[i]<arr[start]){
                int tmp = arr[++last];
                arr[last] = arr[i];
                arr[i] = tmp;
            }
        }
        int temp = arr[last];
        arr[last] = arr[start];
        arr[start] = temp;
        quicksort(arr,start,last-1);
        quicksort(arr,last+1,end);
        return arr;
    }
    public static void outArr(int[] arr){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i] + " ");
        }
    }
}
