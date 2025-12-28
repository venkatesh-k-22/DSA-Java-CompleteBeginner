package com.binarysearch;

public class FloorNumber {
    public static void main(String[] args) {
        int[] arr = {2, 4, 6, 9, 11, 12, 14, 20, 36, 48};
        int target = 1;
        int res = floorNumber(arr,target);
        System.out.println(res);
    }

    //return smallest or equal element index of a target element in an array
    private static int floorNumber(int[] arr, int target) {
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
        return end;
    }
}
