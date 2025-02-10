package org.example;

public class uniqueLetters {

    public static void main(String[] args) {

        String s= "ddeeEEppaakk";

        System.out.println(printUniqueLetters(s));
    }

    private static String printUniqueLetters(String str){

        StringBuilder res= new StringBuilder();
        char[] chars= str.toCharArray();

        for (char c : chars){
            if (res.indexOf(String.valueOf(c)) == -1){
                res.append(c);
            }
        }

        return res.toString();
    }

}
