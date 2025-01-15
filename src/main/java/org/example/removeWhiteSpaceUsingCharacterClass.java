package org.example;

import java.util.Scanner;

public class removeWhiteSpaceUsingCharacterClass {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a sentence.");
        String str= sc.nextLine();

        System.out.println(removeSpaceUsingCharacterClass(str));

    }

    public static String removeSpaceUsingCharacterClass(String s){
        String res="";

        for (int i = 0; i< s.length(); i++){
            char c = s.charAt(i);

            if (!Character.isWhitespace(c)){
               res += c; // res = res + c ;
            }
        }
        return res;
    }
}
