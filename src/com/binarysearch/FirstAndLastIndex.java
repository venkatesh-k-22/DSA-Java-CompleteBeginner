package com.binarysearch;

import java.util.Arrays;

//https://leetcode.com/problems/find-first-and-last-position-of-element-in-sorted-array/description/
public class FirstAndLastIndex {
    public static void main(String[] args) {
        int[] nums = {5, 7, 7, 7, 7, 8, 8, 10};
        int target = 8;
        int[] res = searchRange(nums, target);
        System.out.println(Arrays.toString(res));
    }

    public static int[] searchRange(int[] nums, int target) {
        int[] res = {-1, -1};

        res[0] = searchInRange(nums, target, true);
        res[1] = searchInRange(nums, target, false);
        return res;
    }

    public static int searchInRange(int[] nums, int target, boolean isstartIndex) {
        int posAns = -1;
        int start =0;
        int end = nums.length-1;
        while(start<=end){
            int mid = start+(end-start)/2;
            if(target < nums[mid]){
                end = mid-1;
            }else if(target > nums[mid]){
                start = mid+1;
            }else{
                if(isstartIndex){
                    end=mid-1;
                }else{
                    start = mid+1;
                }
                posAns = mid;
            }
        }
        return posAns;
    }
}
