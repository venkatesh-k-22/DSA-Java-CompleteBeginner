package com.basicprograms;

import java.util.Scanner;

public class PalindromeNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number");
        int n = input.nextInt();
        //Palindrome number is if the number is reversed it should have the same value
        //Ex: 121, 252, 686,... etc
        String res = palindrome(n);
        System.out.println(res);
    }

    public static String palindrome(int n) {
        int res = 0;
        //temp variable holds the value n because n will become 0 at the end
        int temp = n;
        while(n>0){
            int rem = n%10;
            res = (res*10)+rem;
            n=n/10;
        }
        if(res == temp){
            return temp+" is a Palindrome";
        }
        return temp+" is not a Palindrome";
    }
}
