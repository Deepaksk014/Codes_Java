package org.example;

public class CheckDigits {

    public static boolean checkOnlyDigits(String s){
        for(int i=0; i<s.length(); i++){
            if(!Character.isDigit(s.charAt(i))) {
                return false;
            }
        }
        return true;
    }


    public static void main(String[] args) {


        String str1 ="deepak";
        String str2= "12345";
        System.out.println(checkOnlyDigits(str1));
        System.out.println(checkOnlyDigits(str2));

    }
}
