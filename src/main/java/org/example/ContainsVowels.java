package org.example;

public class ContainsVowels {

    public static void main(String[] args) {

        String st="kshb";
        System.out.println(checkForVowels(st));
    }

    public static boolean checkForVowels(String str){

       // return str.toLowerCase().matches(".*[aeiou].*");

        if(str.contains("a") || str.contains("e") || str.contains("i") || str.contains("o") || str.contains("u")){
            return true;
        }
        return false;
    }
}
