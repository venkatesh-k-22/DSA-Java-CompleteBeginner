package com.binarysearch;

//https://leetcode.com/problems/find-smallest-letter-greater-than-target/
public class SmallestLetter {
    public static void main(String[] args) {
        char[] letters = {'a','c','h'};
        char target = 'a';
        char ans = nextGreatestLetter(letters, target);
        System.out.println(ans);
    }

    static char nextGreatestLetter(char[] letters, char target) {
        if(target >= letters[letters.length-1]){
            return letters[0];
        }
        int start = 0;
        int end = letters.length-1;
        while(start <= end){
            int mid = start+(end-start)/2;
            if(target < letters[mid]){
                end = mid-1;
            }else{
                start = mid+1;
            }
        }
        return letters[start];
    }
}
