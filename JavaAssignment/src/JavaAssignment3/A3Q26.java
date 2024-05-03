package JavaAssignment3;

import java.util.Scanner;

public class A3Q26 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num_1 , num_2 , sum = 0 ;
        System.out.print("Enter the firat number: ");
        num_1 = input.nextInt();
        System.out.print("Enter the second number: ");
        num_2 = input.nextInt();
        if(num_1>0){
            sum = num_1 + num_2;
        }
        System.out.print("Addition of the two numbers:"+sum);

    }
}
