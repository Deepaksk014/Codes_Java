package org.example;

import java.util.Arrays;

public class TwoSum {

    public static void main(String[] args) {
        int[] arr={11, 14, 25, 30, 40, 41, 52, 57, 70};
        int target= 25;
        
        if (!twoSum(arr,target)){
            System.out.println("Two sum not found");
        }
    }

    private static boolean twoSum(int[] arr, int target) {

//        Arrays.sort(arr);

        int left=0;
        int right=arr.length-1;

        while (left< right){
            int sum = arr[left] + arr[right];

            if(sum == target){
                System.out.println("Found two sum: " + arr[left] + " + " + arr[right] + " = " + target);
                return true;
            } else if (sum<target) {
                left++;
            }else {
                right--;
            }
        }

        return false;
    }
}
