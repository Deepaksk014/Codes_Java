package logic_building.pattern;

import java.util.Scanner;

public class SquarePattern {
    public static void squarePattern(int n){
        for(int i=0; i<n;i++){
            for(int j=0;j<n; j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter a number");
        int num= sc.nextInt();
        squarePattern(num);
        sc.close();
    }
}
