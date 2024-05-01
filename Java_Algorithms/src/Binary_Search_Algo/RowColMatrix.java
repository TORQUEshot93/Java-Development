package Binary_Search_Algo;

import java.util.Arrays;
import java.util.Scanner;

public class RowColMatrix {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[][] arr ={
                {10, 20, 30, 40},
                {15, 25, 35, 45},
                {28, 29, 37, 49},
                {33, 34, 38, 50}
        };
        System.out.print("Enter the target element to search in the 2D array: ");
        int target = input.nextInt();
        String ans = Arrays.toString(search(arr,target));
        System.out.println(ans);
    }

    static int[] search(int[][] matrix,int target){
        int r = 0;//upper bound
        int c = matrix.length -1;//lower bound

        while(r < matrix.length && c >= 0 ){
                if(matrix[r][c] == target){
                    return new int[]{r,c};
                }
                if(matrix[r][c] < target){
                    r++;
                }else{
                    c--;
                }
        }
        return new int[]{-1,-1};

    }
}
