package org.example;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class checkListHasOddNum {
    public static void main(String[] args) {

        List<Integer> list = new ArrayList<>();
        Scanner sc=new Scanner(System.in);

        System.out.println("enter the number of element to be in the list");
        int n= sc.nextInt();
        sc.nextLine();

        for(int i=0; i<n; i++){
            System.out.print("enter item " + (i+1)+ " : ");
            int e = sc.nextInt();
            list.add(e);
        }

        System.out.println(checkOdd(list));
    }

    public static Boolean checkOdd(List<Integer>list){
        for(int l : list){
            if(l % 2 == 0){
                return false;
            }
        }
        return true;
    }
}
