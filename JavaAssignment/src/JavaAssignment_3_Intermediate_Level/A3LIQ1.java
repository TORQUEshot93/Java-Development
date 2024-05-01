package JavaAssignment_3_Intermediate_Level;

import java.util.Scanner;

//Q.Factorial Program In Java
public class A3LIQ1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int i, fact = 1 , number;
        System.out.print("Enter the number to calculate its Factorial: ");
        number = input.nextInt();
        for (i = 1; i <= number ; i++) {
            fact = fact * i;
        }
        System.out.print("Factorial of number :"+number+" is: "+fact);
    }
}
