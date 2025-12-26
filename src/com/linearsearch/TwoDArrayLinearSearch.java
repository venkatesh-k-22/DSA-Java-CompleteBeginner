package com.linearsearch;

import java.util.Arrays;

public class TwoDArrayLinearSearch {
    public static void main(String[] args) {
        int[][] arr = {
                {12,56,89},
                {13,565,31},
                {32,90}
        };
        int target = 30;
        int[] res = linearSearch2D(arr,target);
        System.out.println(Arrays.toString(res));

        int maxValue = maximum(arr);
        System.out.println(maxValue);
    }

    static int[] linearSearch2D(int[][] arr, int target)
    {
        for (int col = 0; col < arr.length; col++) {
            for (int row = 0; row < arr[col].length; row++) {
                if(arr[row][col] == target)
                {
                  return new int[]{row,col};
                }
            }
        }
        return new int[]{-1, -1};
    }

    //Maximum element in 2D array
    static int maximum(int[][] arr)
    {
        int max = Integer.MIN_VALUE;
        for (int col = 0; col < arr.length; col++) {
            for (int row = 0; row < arr[col].length; row++) {
                if(arr[row][col] > max)
                {
                    max = arr[row][col];
                }
            }
        }
        return max;
    }
}
