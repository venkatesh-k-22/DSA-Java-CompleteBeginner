package com.linearsearch;
//https://leetcode.com/problems/find-numbers-with-even-number-of-digits/description/
public class RichestWealth {
    public static void main(String[] args) {
        int[][] arr = {
            {1,2,3},
            {3,2,1}
        };
        int wealth = maximumWealth(arr);
        System.out.println(wealth);
    }

    public static  int maximumWealth(int[][] accounts) {
        int count = 0;
        int max = Integer.MIN_VALUE;
        for(int row = 0;row<accounts.length;row++){
            count = 0;
            for (int col = 0; col < accounts[row].length; col++) {
                count += accounts[row][col];
            }
            if(count > max){
                max = count;
            }
        }
        return max;
    }


}
