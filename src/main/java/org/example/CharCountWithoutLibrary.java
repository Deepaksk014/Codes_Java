package org.example;

import java.util.Scanner;

public class CharCountWithoutLibrary {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a string.");
        String str= sc.nextLine();

        int[] count= new int[256];

        for(char c : str.toCharArray()){
            count[c]++;
        }

        for (int i=0; i<256 ; i++){
            if(count[i]>0){
                System.out.println((char) i +": " + count[i]);
            }
        }

        sc.close();
    }
}
