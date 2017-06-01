package com.mkd.sort;
import java.util.Arrays;
/**
 * Created by MKD on 2017/3/31.
 */
class BinarySearch {
    public static void main(String[] args){
        System.out.println(binarysearch(new int[] {5,2,6,8,3,4,9,1,10},3));
    }
    public static int binarysearch(int[] arr,int key){
        int low = 0;
        int high = arr.length - 1;
        while(low <= high){
            int mid = low + (high - low) / 2 ;
            if(key < mid){
                high = mid - 1;
            }else if(key > mid){
                low = mid + 1;
            }else return mid;
        }
        return -1;
    }
}

