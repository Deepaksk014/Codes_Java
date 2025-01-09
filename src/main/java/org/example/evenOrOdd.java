package org.example;

import java.util.Scanner;

public class evenOrOdd {

    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("enter a number");
        int num=sc.nextInt();
        checkEvenOrOdd(num);
    }

    private static void checkEvenOrOdd(int num) {
        if((num/2)== 0){
            System.out.println("its even");
        }else {
            System.out.println("its odd");
        }
    }
}
