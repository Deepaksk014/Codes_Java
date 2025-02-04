package org.example;

import java.util.HashSet;
import java.util.Set;

public class PalindromicSubstrings {
    public static void main(String[] args) {
        String input = "aabbbaa";
        System.out.println("Palindromic Substrings: " + findPalindromicSubstrings(input));
    }
    public static boolean isPalindrome(String str){

        int left=0;
        int right=str.length()-1;

        while (left < right) {
            if (str.charAt(left++) != str.charAt(right--)) return false;
        }

        return true;
    }
    private static Set<String> findPalindromicSubstrings(String input) {

        Set<String> palimdromes= new HashSet<>();
        for (int i=0;i<input.length();i++){
            for (int j=i+1; j<input.length();j++){
                String sub=input.substring(i,j);

                if (isPalindrome(sub)) {

                    palimdromes.add(sub);
                }
            }
        }

        return palimdromes;
    }
}
