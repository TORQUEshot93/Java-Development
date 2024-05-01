package JavaAssignment_3_Intermediate_Level;

import java.util.Scanner;

//Q.Calculate Average Of N Numbers
public class A3LIQ3 {
    public static void main(String[] args) {
        Scanner input =new Scanner(System.in);
        float num , sum = 0, Average;
        int count = 1, n =1;
        System.out.print("Enter the value of n:");
        n = input.nextInt();
        while(count<= n){
            System.out.print("Enter the "+count+" number:");
            num = input.nextInt();
            sum = sum + num;
            count++;
        }
        Average = sum / n;
        System.out.print("The average of the numders is: "+Average);
    }
}
