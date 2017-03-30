package com.mkd.sort;

/**
 * Created by MKD on 2017/3/30.
 */
class QuickDemo2 {
    public static void main(String[] args){
        outArr(quicksort(new int[] {4,2,6,8,3,4,6,2,9,3,6},0,10));
    }
    public static int[] quicksort(int[] arr,int start,int end){
        if(start<end){
            int base = arr[start];  //选定基准值
            int tmp;//记录中间值
            int i = start;
            int j = end;
            do{
                while((arr[i] < base) && (i<end))
                    i ++;
                while((arr[j]>base) && (j>start))
                    j --;
                if(i <= j){
                    tmp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = tmp;
                    i++;
                    j--;
                }
            }while(i <= j);
            if (start < j)
                quicksort(arr,start,j);
            if (end > i)
                quicksort(arr,i,end);
        }
        return arr;
    }
    public static void outArr(int[] arr){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i] + " ");
        }
    }
}
