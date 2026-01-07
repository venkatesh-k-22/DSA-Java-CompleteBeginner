package com.binarysearch;
//https://leetcode.com/problems/peak-index-in-a-mountain-array/description/
public class PeakIndexMountainArray {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 5, 7, 6, 3, 2};
        int ans = peakIndexInMountainArray(arr);
        System.out.println(ans);
    }
    public static int peakIndexInMountainArray(int[] arr) {
        int start = 0;
        int end = arr.length-1;
        //if start and end are equal, this loop will break
        while(start != end){
            int mid = start+(end-start)/2;
            if(arr[mid] > arr[mid+1]){
                // You are in the decreasing part of the array
                // This mid could be the peak, but look left to be sure
                end = mid;
            }else{
                // You are in the increasing part of the array
                // mid + 1 is greater than mid, so mid is not the peak
                start = mid+1;
            }
        }
        return start;
    }
}
