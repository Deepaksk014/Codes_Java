package org.example;

public class MaxSubarraySumKadanAlgo {

    public static void main(String[] args) {
        int[] arr= {2, 3, -8, 7, -1, 2, 3};
        System.out.println(maxSubarraySumKadanAlgo(arr));
    }

    private static int maxSubarraySumKadanAlgo(int[] arr) {

        int res=arr[0];
        int maxSubArr=arr[0];

        for (int i=0; i<arr.length;i++){
            maxSubArr=Math.max(maxSubArr+arr[i],arr[i]);

            res=Math.max(res,maxSubArr);
        }

        return res;
    }
}
