package org.example;

import java.util.Scanner;

public class MiddleCharacter {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("enter the string");
        String str=sc.nextLine();
        int len = str.length();
        char middle = (len%2==0)? str.charAt(len /2 -1) : str.charAt(len /2);
        System.out.println("middle char is: " + middle);
    }
}
