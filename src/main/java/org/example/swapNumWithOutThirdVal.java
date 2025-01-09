package org.example;

import java.util.Scanner;

public class swapNumWithOutThirdVal {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a;
        int b;

        System.out.println("enter the first value.");
         a=sc.nextInt();
        System.out.println("enter the second value.");
        b=sc.nextInt();

        swapedNum(a,b);
    }

    public static void swapedNum(int a, int b){
        System.out.println("a is "+ a + " "+ "b is "+ b);
        b = a + b;
        a= b - a;
        b= b - a;

        System.out.println("After swapping:");
        System.out.println("a is "+ a +  "\nb is " + b);

    }
}
