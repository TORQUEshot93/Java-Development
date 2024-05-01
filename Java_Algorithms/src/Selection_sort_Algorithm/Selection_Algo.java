package Selection_sort_Algorithm;

import java.util.Arrays;

public class Selection_Algo {
    public static void main(String[] args) {
        int[] arr = {5,3,4,2,1,6,7,9,8,10};
        SelectionSort(arr);
        System.out.println(Arrays.toString(arr));
    }
    //
    static void SelectionSort(int[] arr){
        for (int i = 0; i < arr.length; i++) {
            int last = arr.length - i - 1;
            int maxindex = getmaxIndex(arr,0,last);
            swap(arr,maxindex,last);
        }
    }
    //
    static int getmaxIndex(int[] arr,int start,int last){
        int max = start;
        for (int i = start; i <= last; i++) {
            if(arr[max] < arr[i]){
                max = i ;
            }
        }
        return max;
    }
    //
    static void swap(int[] arr,int first,int second){
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
}
