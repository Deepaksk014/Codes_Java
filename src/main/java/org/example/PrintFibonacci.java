package org.example;

import java.util.Scanner;

public class PrintFibonacci {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a number.");
         int num= sc.nextInt();

        printFibonacciSequence(num);
    }

    public static void printFibonacciSequence(int num){

        int a =0;
        int b= 1;
        int c= 1;

        for(int i = 0; i< num; i++){
            System.out.print(a+ ", ");

            a= b;
            b= c;
            c= a + b;
        }




    }
}
