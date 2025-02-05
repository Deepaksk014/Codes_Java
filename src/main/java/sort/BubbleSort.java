package sort;

import java.util.Arrays;

public class BubbleSort {
    public static void main(String args[]){
        int[] arr = { 64, 34, 25, 12, 22, 11, 90 };
        int n = arr.length;
        System.out.println(Arrays.toString(bubbleSort(arr, n)));

    }

    private static int[] bubbleSort(int[] arr, int n) {

        int tem;

        boolean swapped;

        for (int i=0;i<n-1;i++){
            swapped =false;
            for (int j=0;j<n-i-1; j++){
                if (arr[j]>arr[j+1]){
                    tem=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=tem;
                    swapped =true;
                }
            }

            if (swapped==false){
                break;
            }
        }
        return arr;
    }
}
