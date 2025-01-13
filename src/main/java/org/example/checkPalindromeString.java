package org.example;

import java.util.Scanner;

public class checkPalindromeString {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a word to check palindrome.");
        String str= sc.nextLine();

        if (checkPalindromeForString(str)){
            System.out.println("it's a palindrome.");
        }else {
            System.out.println("it's not a palindrome");
        }
    }

    private static boolean checkPalindromeForString(String s){
        boolean result=true;
        int length = s.length();


        for (int i =0; i<length/2; i++){
            int demo = length-i-1;
            if (s.charAt(i) != s.charAt(length-i-1)){

                result= false;
                break;
            }
        }
        return result;
    }
}
