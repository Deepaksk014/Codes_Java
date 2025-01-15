package org.example;

import java.util.Scanner;
import java.util.stream.Collectors;

public class removeWhiteSpaceUsingStream {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a sentence.");
        String str = sc.nextLine();

        System.out.println(removeSpaceUsingStream(str));

    }

    private static String removeSpaceUsingStream(String s) {
        s = s.chars().filter(c ->!Character.isWhitespace(c)).mapToObj(c -> String.valueOf((char)c )).collect(Collectors.joining());
     return s;
    }


}
