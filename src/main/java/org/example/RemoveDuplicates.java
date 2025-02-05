package org.example;

import java.util.Arrays;

public class RemoveDuplicates {

    public static void main(String[] args) {
        int[] arr = {1, 2, 2, 3, 4, 4, 4, 5, 5};
     int size=removeDuplicates(arr);

       for (int i=0;i<size;i++){
           System.out.print(arr[i] + " ");
       }


    }

    private static int removeDuplicates(int[] arr) {
        int n=arr.length;


        if (n<=1){
            return 1;
        }

        int idx=1;

        for (int i=1;i<n;i++){
            if (arr[i] != arr[i-1]){
                arr[idx++]=arr[i];
            }
        }

        return idx;
    }
}
