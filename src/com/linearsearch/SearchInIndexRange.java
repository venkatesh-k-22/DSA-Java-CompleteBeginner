package com.linearsearch;

public class SearchInIndexRange {
    public static void main(String[] args) {
        int[] arr = {23, 18, 34, 90, 11, 78};
        int target = 100;
        int start = 1;
        int end = 5;
        int res = linearSearch(arr, target, start, end);
        System.out.println(res);
    }
    static int linearSearch(int[] arr, int target, int start, int end) {
        if(arr.length == 0){
            return -1;
        }
        for (int index = start; index < end; index++) {
            if(arr[index] == target){
                return index;
            }
        }
        return -1;
    }
}
