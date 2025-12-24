package com.venky;

import java.util.Scanner;

public class Conversion {
    public static void main(String[] args) {
//        Scanner input = new Scanner(System.in);
//        int num1 = input.nextInt();
//        int num2 = input.nextInt();
//        //automatic type promotion
//        float f = num1+num2;
        // we cant convert float to int automatically
//        System.out.println(f);

        //if we want explicit type casting we can use ()
//        int a = (int)(67.87);
//        System.out.println(a);

        // lets check for byte byte size is 256
//        byte a = 40;
//        byte b = 50;
//        byte c = 100;
//        //while performing operation automatically java converts from byte to int
//        //a and  b is byte first it will get 2000 but the operation will take into int
//        int res = (a*b)/c; // 20
//        System.out.println(res);
        //Java supports UNICODE
        int cha = 'a';
        System.out.println(cha);// it will take the ADCII value of a i.e, 97
        // you can add any language
        System.out.println("ನಮಸ್ಕಾರ");


    }
}
