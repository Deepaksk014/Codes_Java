package org.example;

import java.util.Scanner;

public class GCD {

    public static int findGcd(int num1, int num2){
        return (num2 == 0)? num1: findGcd(num2, num1% num2);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the value for 1st number");
        int n1= sc.nextInt();
        System.out.println("enter the value for 2nd number");
        int n2=sc.nextInt();

        System.out.println("GCD is: " + findGcd(n1,n2));
    }
}
