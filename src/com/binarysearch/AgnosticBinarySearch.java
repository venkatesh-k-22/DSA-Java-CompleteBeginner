package com.binarysearch;

public class AgnosticBinarySearch {
    public static void main(String[] args) {
//        int[] arr = {99,85,78,45,33,22,20,9,-18,-22};
        int[] arr = {2, 4, 6, 9, 11, 12, 14, 20, 36, 48};
        int target = 6;
        int ans = orderAgnosticBinarySearch(arr, target);
        System.out.println(ans);
    }

    static int orderAgnosticBinarySearch(int[] arr, int target) {
        int start = 0;
        int end = arr.length-1;
        boolean isASC = arr[start] < arr[end];
        while(start <= end){
            int mid = start+(end-start)/2;
            if(target == arr[mid]){
                return mid;
            }
            if(isASC){
                if(target > arr[mid]){
                    start = mid+1;
                }
                else{
                    end = mid-1;
                }
            }else{
                if(target < arr[mid]){
                    start = mid+1;
                }
                else{
                    end = mid-1;
                }
            }

        }
        return -1;
    }
}
