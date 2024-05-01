package JavaAssignment3;

import java.util.Scanner;

//Q.Take integer inputs till the user enters 0 and print the sum of all numbers (HINT: while loop)
public class A3Q24 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int sum = 0,x = 0;
        System.out.println("Enter the number to add: ");
        x = input.nextInt();
        while(x > 0){
            if(x > 0){
                sum = sum + x;
            }else{
                System.out.println("no data was entered!");
            }
            x = input.nextInt();
        }
        System.out.println("Sum: "+sum);
    }
}
