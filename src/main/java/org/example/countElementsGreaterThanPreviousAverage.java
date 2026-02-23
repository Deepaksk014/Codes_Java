package org.example;


import java.util.ArrayList;
import java.util.List;

public class countElementsGreaterThanPreviousAverage {

    public static void main(String[] args) {
        List<Integer> elementsList= new ArrayList<>();
        elementsList.add(100);
        elementsList.add(200);
        elementsList.add(150);
//        elementsList.add(300);

        int count=0;
        if(elementsList.size()<= 1 ){
            System.out.println(count);
            return;
        }

        int sum = elementsList.get(0);
        int size= elementsList.size();

        for (int i=1 ; i< size; i++){

            double avg = (double) sum/i;
        if (elementsList.get(i)> avg){
            count++;

        }
        sum += elementsList.get(i);


        }
        System.out.println(count);

    }


}
