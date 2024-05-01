package Linear_Search_Algo;

import java.util.Scanner;

//Q.Minimum Number Search in list by using Linear Search
public class MinimunNumberInSearch {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int[] nums = {34,45,56,23,54,23,64,14,57,77};
        int ans = MinimunNumberSearch(nums);
        System.out.print("The Minimum Number in the list is:");
        System.out.println(ans);
    }

    static int MinimunNumberSearch(int[] arr){
        if(arr.length == 0){
            return -1;
        }
        //
        int min = arr[0];
        for (int i = 1; i < arr.length ; i++) {
            if (arr[i] < min){
                min = arr[i];
            }
        }
        return min;
    }
}
