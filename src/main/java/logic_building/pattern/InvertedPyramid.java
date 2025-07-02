package logic_building.pattern;

import java.util.Scanner;

public class InvertedPyramid {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("enter a number:");
        int num = sc.nextInt();
        invertedPyramid(num);
        sc.close();

    }




    private static void invertedPyramid(int num) {


       for (int i=0; i<num; i++){
           for(int j=0;j<i; j++){
               System.out.print("  ");
           }
           for(int k=0; k<(2*(num-i)-1); k++){
               System.out.print("* ");
           }
           System.out.println();
       }
    }
}
