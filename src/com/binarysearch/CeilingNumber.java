package com.binarysearch;

public class CeilingNumber {
    public static void main(String[] args) {
        int[] arr = {2, 4, 6, 9, 11, 12, 14, 20, 36, 48};
        int target = 70;
        int res = ceilingNumber(arr,target);
        System.out.println(res);
    }

    //return greatest number or equal number index of an target element
    //if the target does not exist in array return -1
    static int ceilingNumber(int[] arr, int target) {
        if(target > arr[arr.length-1]){
            return -1;
        }
        int start = 0;
        int end = arr.length - 1;
        while(start <= end){
            int mid = start+(end-start)/2;
            if(target == arr[mid]){
                return mid;
            }else if(target > arr[mid]){
                start = mid+1;
            }else{
                end = mid-1;
            }
        }
        return start;
    }
}
