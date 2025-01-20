package org.example;

import java.util.Scanner;

public class findFactorial {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("enter a number to find factorial.");
        long num=sc.nextInt();

        System.out.println(factorial(num));
    }

    private static long factorial(long num) {

        if (num == 1){
            return 1;
        } else {
            return (num* factorial(num -1));
        }
    }
}
