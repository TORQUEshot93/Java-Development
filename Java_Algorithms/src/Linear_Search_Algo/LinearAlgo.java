package Linear_Search_Algo;// Linear Search Algorithm
import java.util.Scanner;

public class LinearAlgo {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] nums = {12,34,45,22,45,2,65,43,7,4,23};
        System.out.println("Enter the num you want to search in the list: ");
        int target = input.nextInt();
        int ans = linearSearch(nums,target);
        System.out.println("The index of the searched number is :");
        System.out.println(ans);
    }

    // search in the array: return the index if item found
    // otherwise if item not found return-1
    static int linearSearch(int[] arr,int target){
           if( arr.length == 0 ){
               return - 1;
           }
           // run a for loop
           for (int index = 0; index < arr.length; index++) {
              int element = arr[index];
              if (element == target){
                  return index;
              }
           }
           //this line will execute if none of the return statements above have executed
           //hence the target not found
           return -1;
    }
}