package org.example;

public class BinarySearch {
    public static void main(String[] args) {
        int[] arr={11, 14, 25, 30, 40, 41, 52, 57, 70};
        int end= arr.length;
        int target=11;

       int res= binarySearch(arr,0,end,target);

       if (res == -1){
           System.out.println("element not found");
       } else {
           System.out.println("element found at index " + (res-1));
       }

    }

    public static int binarySearch(int[] arr,int beg, int end, int target){
        int mid;

        if(end>=beg) {
            mid = beg + (end - beg) / 2;


            if (arr[mid] == target) {
                return mid + 1;
            } else if (arr[mid] < target) {
                return binarySearch(arr, mid + 1, end, target);
            } else {
                return binarySearch(arr, beg,mid - 1,  target);
            }
        }

        return -1;
    }
}
