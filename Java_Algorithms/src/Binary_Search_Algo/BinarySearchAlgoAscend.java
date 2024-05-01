package Binary_Search_Algo;

import java.util.Scanner;

public class BinarySearchAlgoAscend {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] nums = {-45,-31,-23,-10,-9,-2,0,2,14,23,34,45,56,67,78,89,90};
        System.out.print("Enter the element you want to search in the array: ");
        int target = input.nextInt();
        int ans = BinarySearch(nums,target);
        System.out.print("It is located at index number: "+ans);
    }
    //Binary Search Algorithm.
    static int BinarySearch(int[] arr,int target){
        int start  = 0;
        int end = arr.length-1;

        while(start<=end){
            //find the middle element
            //int mid = (start + end) / 2; // might be possible that (start + end) exceed
            int mid = start + (end - start) / 2;

            if (target < arr[mid]){
                end = mid - 1;
            }else if(target > arr[mid]){
                start = mid + 1;
            }else {
                //ans found
                return mid;
            }
        }
        return -1;
    }
}
