package com.binarysearch;

//https://leetcode.com/problems/find-peak-element/
public class PeakElement {
    public static void main(String[] args) {
        int[] nums = {1,2,1,3,5,6,4};
        int ans = findPeakElement(nums);
        System.out.println(ans);
    }

    public static int findPeakElement(int[] nums) {
        int start = 0;
        int end = nums.length-1;
        //if start and end are equal, this loop will break
        while(start != end){
            int mid = start+(end-start)/2;
            if(nums[mid] > nums[mid+1]){
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
