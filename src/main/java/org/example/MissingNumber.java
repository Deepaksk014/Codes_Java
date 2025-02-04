package org.example;

public class MissingNumber {
    public static void main(String[] args) {
        int[] arr = { 1, 2,4,5,6 };

        System.out.println(missingNumber(arr));
    }

    private static int missingNumber(int[] arr) {

        int len= arr.length+1;
        int sum=0;
        int expectedSum= (len * (len+1))/2;

        for (int i=0;i<len-1;i++){
            sum=sum+arr[i];
        }

        return expectedSum - sum;
    }
}
