package org.example;

import java.util.Scanner;

public class reverseString {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("enter the string to be reversed,");
        String str=sc.nextLine();

        System.out.println(reverse(str));
    }


    public static  String reverse(String strToRev){
        if(strToRev == null ){
            throw new IllegalArgumentException("string can not be null");

        }
        if(strToRev.isEmpty() ){
            throw new IllegalArgumentException("string is empty");

        }


        StringBuilder reversedStr = new StringBuilder();

        char[] charArr = strToRev.toCharArray();

        for (int i = charArr.length-1; i >= 0; i-- ){
            reversedStr.append(charArr[i]);
        }
        return reversedStr.toString();
    }
}