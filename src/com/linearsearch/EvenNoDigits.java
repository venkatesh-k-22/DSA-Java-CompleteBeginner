package com.linearsearch;

//https://leetcode.com/problems/find-numbers-with-even-number-of-digits/description/
//leet code problem
public class EvenNoDigits {
    public static void main(String[] args) {
        int[] arr = {12,345,2,6,7896};
        int res = findNumbers(arr);
        System.out.println(res);
    }

    public static int findNumbers(int[] arr) {
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if(evenDigits(arr[i])){
                count++;
            }
        }
        return count;
    }

    static boolean evenDigits(int n) {
        int count = 0;
        count = findDigits(n);
        if(count%2 == 0){
            return true;
        }
        return false;
    }

    static int findDigits(int num){
        return (int)(Math.log10(num)+1);
    }
}
