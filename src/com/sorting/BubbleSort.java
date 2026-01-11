package com.sorting;

import java.util.Arrays;

public class BubbleSort {
    public static void main(String[] args) {
        int[] arr = {3,1,5,4,2};
        bubbleSort(arr);
        System.out.println(Arrays.toString(arr));
    }

    public static int[] bubbleSort(int[] arr) {
        boolean isSorted;
        //check for N-1 times
        for (int i = 0; i < arr.length; i++) {
            isSorted = false;
            //check for N-length-i times
            for (int j = 1; j < arr.length-i; j++) {
                //swap the code
                if(arr[j] <arr[j-1]) {
                    int temp = arr[j];
                    arr[j] = arr[j-1];
                    arr[j-1] = temp;
                    isSorted = true;
                }
            }
            //if array is sorted break the loop
            if(!isSorted){
                break;
            }
        }
        return arr;
    }
}
