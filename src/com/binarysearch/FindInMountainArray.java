package com.binarysearch;
//https://leetcode.com/problems/find-in-mountain-array/description/
public class FindInMountainArray {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,3,1};
        int target = 3;
        //First Find peak element
        int peak = peakIndex(arr);
        System.out.println(peak);
        //search in Ascending order
        int firstTry = orderAgnosticSearch(arr, target, 0, peak);
        if(firstTry != -1){
            System.out.println(firstTry);
        }else{
            //if not found serahc in descending order
            System.out.println(orderAgnosticSearch(arr, target, peak+1, arr.length-1));
        }
    }

    private static int orderAgnosticSearch(int[] arr, int target, int start, int end) {
        boolean isAsc = arr[start] < arr[end];

        while(start <= end){
            int mid = start+(end-start)/2;
            if(arr[mid] == target){
                return mid;
            }else{
                if(isAsc){
                    if(target > arr[mid]){
                        end = mid-1;
                    }else{
                        start = mid+1;
                    }
                }else{
                    if(target > arr[mid]){
                        start = mid+1;
                    }else{
                        end = mid-1;
                    }
                }
            }
        }
        return -1;
    }

    public static int peakIndex(int[] arr) {
        int start = 0;
        int end = arr.length-1;

        while(start != end){
            int mid = start+(end-start)/2;
            if(arr[mid] > arr[mid+1]){
                end = mid;
            }else if(arr[mid] < arr[mid+1]){
                start = mid+1;
            }
        }
        return start;
    }
}
