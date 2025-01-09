package org.example;

import java.util.Scanner;

public class FibonacciRecursive {
    public static void main(String[] args) {
     Scanner sc = new Scanner(System.in);
        System.out.println("enter a number");
     int num= sc.nextInt();
        System.out.println("A Fibonacci sequence of " + num + " numbers: ");

        for(int i =0; i<num; i++){
            System.out.println(PrintFibonacciRecursive(i)+ " ");
        }
    }

    public static long PrintFibonacciRecursive(int num){
        if(num <= 1){
            return num ;
        } else {
            return PrintFibonacciRecursive(num-1)+ PrintFibonacciRecursive(num-2);
        }
    }
}
