package Insertion_Sort_Algo;

import java.util.Arrays;

//Insertion Sort
public class Insertion_sort_algo {
    public static void main(String[] args) {
        int[] arr = {5,4,3,1,2};
        Insertion(arr);
        System.out.println(Arrays.toString(arr));
    }
    //
    static void Insertion(int[] arr){
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 1 + i; j > 0 ; j--) {
                if (arr[j]<arr[j-1]){
                    swap(arr,j,j-1);
                }else{
                    break;
                }
            }
        }
    }
    //
    static void swap(int[] arr,int first,int second){
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
}
