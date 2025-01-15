package org.example;

import java.util.Scanner;

public class removeWhiteSpace {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the sentence.");
        String str=sc.nextLine();

        System.out.println(removeSpace(str));
    }

    public static String removeSpace(String s){
        s = s.replaceAll("\\S","");
        return s;
    }
}
