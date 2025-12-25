package com.basicprograms;

import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number:");
        int n = input.nextInt();
        //Fibonacci numbers is adding previous element to current number to get the fibonacci number
        //for 0 = 0, 1 = 1
        //0, 1, 1, 2, 3, 5, 8, 13....n
        int res = fibonacci(n);
        System.out.println("Fibonacci of "+ n +" is "+res);

    }

    public static int fibonacci(int n) {
        int a = 0;
        int b = 1;
        if(n < 2){
            return n;
        }
        //swapping technique to get the fibonacci number
        for(int i=2;i<=n;i++){
            int res = a+b; // add previous and current number to get the next fibonacci
            a=b;// swap the current number with previous number
            b=res;//swap the result value into current value
        }
        return b; // return b because b holds the result value
    }
}
