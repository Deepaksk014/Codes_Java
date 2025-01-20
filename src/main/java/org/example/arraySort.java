package org.example;

import java.util.Arrays;
import java.util.Scanner;

public class arraySort {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the number of element in the array");
        int n = sc.nextInt();
        int[] arr = new int[n];

        for (int i =0; i< n; i++){
            System.out.println("enter a number to be stored in " + i);
            int num = sc.nextInt();
            arr[i]=num;
        }

        sc.close();
        simpleSort(arr);
    }

    private static void simpleSort(int[] arr) {

        Arrays.sort(arr);
        System.out.print("sorted array: ");
        System.out.println(Arrays.toString(arr));
    }
}
