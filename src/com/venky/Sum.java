package com.venky;

import java.util.Scanner;

public class Sum {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter 2 numbers:");
        //float can take integer as well as floating values
        //destination type should be greater than the source type
        float num1 = input.nextInt();
        float num2 = input.nextInt();
        float sum = num1+num2;
        System.out.println(sum);
    }
}
