package com.venky;

import java.util.Scanner;

public class Inputs {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        //input the int datatype
//        System.out.print("Enter a number: ");
//        int a = input.nextInt();
//        System.out.println("You entered "+a);

        //input the String
//        System.out.print("Enter a name: ");
//        //next() will print only one word after space words it won't take
//        String name = input.next();
//        //nextLine() will take all the string you enter
//        String name = input.nextLine();
//        System.out.println("Welcome " +name);

        // input the floating values
        System.out.print("Enter a number ");
        float num = input.nextFloat();
        System.out.println("Number is: " +num);


    }
}
