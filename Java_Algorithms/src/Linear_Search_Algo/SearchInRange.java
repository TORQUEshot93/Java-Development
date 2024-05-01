package Linear_Search_Algo;

import java.util.Scanner;

//Q.Search in Range using LinearSearch
public class SearchInRange {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int[] nums = {12,34,45,56,23,54,23,64,14,57,77};
        System.out.print("Enter the num you want to search in the list:");
        int target = input.nextInt();
        System.out.print("Enter the start point of the range:");
        int start = input.nextInt();
        System.out.print("Enter the end point of the range:");
        int end = input.nextInt();
        int ans = SearchInRange(nums,target,start,end);
        System.out.print("The index of the serach element in the given range:");
        System.out.println(ans);
    }
    static int SearchInRange(int[] arr,int target,int start,int end){
        if( arr.length == 0){
            return -1;
        }
        for (int index = start; index < end; index++) {
            int element = arr[index];
            if(element == target){
                return index;
            }
        }
        //
        return -1;
    }
}
