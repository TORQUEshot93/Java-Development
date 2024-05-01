package Binary_Search_Algo;

import java.util.Scanner;

public class RowColMatrixQ2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int arr[][] = {
                {1,2,3,4},
                {5,6,7,8},
                {9,10,11,12},
                {13,14,15,16}
        };
        int target = input.nextInt();
        int row = arr.length;
        int colmun = arr[0].length;
        System.out.println(+colmun);
    }
}
