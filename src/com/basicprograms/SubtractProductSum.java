package com.basicprograms;

import java.util.Scanner;

//https://leetcode.com/problems/subtract-the-product-and-sum-of-digits-of-an-integer/
public class SubtractProductSum {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int n = input.nextInt();
        int res = subtractProductAndSum(n);
        System.out.println(res);
    }

    public static int subtractProductAndSum(int n) {
        int product = 1;
        int sum = 0;
        while(n>0){
            int rem = n%10;
            product = product*rem;
            sum = sum+rem;
            n/=10;
        }
        return product-sum;
    }
}
