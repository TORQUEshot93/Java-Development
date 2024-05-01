import java.util.Arrays;
import java.util.Scanner;

public class MultidimensionalArrays {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        /*
        1 2 3
        4 5 6
        7 8 9
         */
        int[][] arr = new int[3][3];

//        int[][] array2D = {
//                {1,2,3},
//                {4,5},
//                {5,6,7,8}
//        };
        for(int row = 0; row < arr.length;row++){
            //
            for(int col = 0; col < arr[row].length;col++){
                arr[row][col] = input.nextInt();
            }
        }
        //output
//        for(int row = 0; row < arr.length;row++){
//            //
//            for(int col = 0; col < arr[row].length;col++){
//                System.out.print(arr[row][col]+" ");
//            }
//            System.out.println();
//        }
        //toString Method
//        for(int row = 0; row < arr.length;row++){
//            System.out.println(Arrays.toString(arr[row]));
//        }
        //Enchaced for loop
        for(int[] a : arr){
            System.out.println(Arrays.toString(a));
        }
    }
}
