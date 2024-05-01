package Linear_Search_Algo;

import java.util.Arrays;
import java.util.Scanner;

//Q.Linear Search in 2D Array
public class LinearSearchIn2DArray {
    public static void main(String[] args){
        Scanner input = new Scanner (System.in);
        int[][] nums = {
                {12,23,45},
                {34,67,78,89},
                {31,65,87},
                {98,75}
        };
        System.out.print("Enter the number you want to search in 2D aray list: ");
        int target = input.nextInt();
        int[] ans = search(nums,target);
        System.out.println(Arrays.toString(ans));
        System.out.print("Maximum number in 2D array is:");
        System.out.println(max(nums));
    }

    static int[] search(int[][] arr, int target){
        if (arr.length==0){
            return new int[]{-1,-1};
        }

        for (int row = 0; row < arr.length ; row++) {
            for (int colmun = 0; colmun < arr[row].length; colmun++) {
                if(arr[row][colmun] == target){
                    return new int[]{row,colmun};
                }
            }
        }

        return new int[]{(int) -1.,-1};
    }
    static int max(int[][] arr){
        int max = Integer.MIN_VALUE;
        for (int[] Ints:arr){
            for(int element:Ints){
                if ( element > max){
                    max = element;
                }
            }
        }
        return max;
    }
}
