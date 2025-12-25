package com.linearsearch;

public class LinearSearch {
    public static void main(String[] args) {
        int[] arr = {23, 18, 34, 90, 11, 78};
        int target = 100;
        int res = linearSearch(arr, target);
        System.out.println(res);
    }
    //return the index of the element if the target element found at Array
    //else return -1
    //time complexity - Worst Case: O(n), Best Case: O(1)
    static int linearSearch(int[] arr, int target) {
        if(arr.length == 0){
            return -1;
        }
        for (int index = 0; index < arr.length; index++) {
            if(arr[index] == target){
                return index;
            }
        }
        return -1;
    }
}
