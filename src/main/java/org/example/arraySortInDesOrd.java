package org.example;

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class arraySortInDesOrd {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the number of element in the array");
        int n = sc.nextInt();
        Integer[] arr = new Integer[n];

        for (int i =0; i< n; i++){
            System.out.println("enter a number to be stored in " + i);
            arr[i] = sc.nextInt();

        }

        arraySorted(arr);
    }

    private static void arraySorted(Integer[] arr) {

        Arrays.sort(arr, Collections.reverseOrder());
        System.out.print("sorted array: ");
        System.out.println(Arrays.toString(arr));
    }
}
