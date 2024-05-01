package Binary_Search_Algo;

import java.util.Scanner;

public class BinarySearchAlgoDecend {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int[] nums = {100,98,87,76,65,54,43,32,21,12,10,7,3,1};
        System.out.print("Enter the number you want to search in the array: ");
        int target = input.nextInt();
        int ans = DecendBinarySearch(nums,target);
        System.out.println("It is located at index number: "+ans);
    }
    //
    static int DecendBinarySearch(int[] arr,int target){
        int start = 0;
        int end = arr.length -1 ;

        while( start <= end ){
            int mid = start + (end - start) / 2;

            if(target < arr[mid]){
                start = mid + 1 ;
            } else if(target > arr[mid]) {
                end = mid - 1;
            }else {
                return mid;
            }
        }
        return -1;
    }
}
