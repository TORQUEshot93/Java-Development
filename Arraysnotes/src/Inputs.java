import java.util.Arrays;
import java.util.Scanner;

public class Inputs {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        //Array of Primitives
        int[] arr = new int[5];
        arr[0] = 1;
        arr[1] = 2;
        arr[3] = 3;
        arr[4] = 4;
        System.out.println(arr[3]);


//        for(int i = 0; i < arr.length; i++){
//            arr[i] = input.nextInt();
//        }
//
//        for(int i = 0;i < arr.length; i++){
//            System.out.print(arr[i] + " ");
//        }
//
//        for(int num : arr){// for every element in array, print the array
//            System.out.print(num + " ");// here num represents element of the array
//        }
//
//        System.out.println(arr[5]);// index out of bound error
        //array of Objects:
        String[] str = new String[4];
        for(int i = 0; i < str.length;i++){
            str[i] = input.next();
        }
        System.out.println(Arrays.toString(str));

        //Modifying:
        str[1]="Omkar";
        System.out.println(Arrays.toString(str));
    }

}
