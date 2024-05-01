package Bubble_sort_Algo;

import java.util.Arrays;

public class BubbleSortAlgorithm {
    public static void main(String[] args) {
        int[] arr = {12,234,456,23,567,28,45,67,11,13,29,4,3,34};
        Bubble(arr);
        System.out.println(Arrays.toString(arr));
    }
    //
    static void Bubble(int[] arr){
        boolean swapped;
        for (int i = 0; i < arr.length ; i++) {
            //
            swapped = false;
            for (int j = 1; j < arr.length-i ; j++) {
                if(arr[j] < arr[j-1]){
                    int temp = arr[j];
                    arr[j] = arr[j-1];
                    arr[j-1] = temp;
                    swapped = true ;
                }
            }

            //
            if(!swapped){
                break;
            }
        }
    }
}
