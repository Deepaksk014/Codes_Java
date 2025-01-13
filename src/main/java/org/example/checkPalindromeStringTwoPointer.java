package org.example;

import java.util.Scanner;

public class checkPalindromeStringTwoPointer {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("enter a string to check:");
        String str = sc.nextLine();

        if(checkPalindrome(str)){
            System.out.println("it's a palindrome.");
        }else {
            System.out.println("it's not a palindrome.");
        }
    }

    public static boolean checkPalindrome(String s) {

        if(s.isEmpty() || s.isBlank()){
            throw new IllegalArgumentException("entered input is invalid.");
        }
        int left = 0;
        int right = s.length()-1;

        while (left < right) {

            if (s.charAt(left) != s.charAt(right)) {
                return false;
            } else {
                left++;
                right--;
            }
        }
        return true;
    }
}
