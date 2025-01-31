package logic_building.pattern;

import java.util.Scanner;

public class Pyramid {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("enter a number:");
        int num = sc.nextInt();
        pyramid(num);
        sc.close();

    }

    private static void pyramid(int num) {
        for(int i=0; i<num; i++){
            for(int j=0;j<num-i-1;j++){
                System.out.print("  ");
            }

            for(int k=0;k<(2*i+1);k++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
