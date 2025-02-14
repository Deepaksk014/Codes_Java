package org.example;

import java.util.Arrays;

public class TwoSumUnSorted {

    public static void main(String[] args) {
        int[] arr={4,1,8,5,10};
        int target= 13;

        System.out.println(Arrays.toString(printTwoNum(arr, target)));

    }

    private static int[] printTwoNum(int[] arr, int target){
        int n= arr.length;

        for (int i=0; i<n; i++){
            for(int j=i+1; j<n; j++){
                if (arr[i] + arr[j]== target){
                    return new int[]{i,j};
                }
            }
        }
        return new int[]{};
    }
}
