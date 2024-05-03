package JavaAssignment3;

import java.util.Scanner;

//Q.Input a number and print all the factors of that number (use loops).
public class A3Q23 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number to find the factors of it:");
        int number = input.nextInt();
        System.out.print("Factors of number: "+number+" are: ");
        for (int i = 1; i <= number; i++) {
            if ( number % i == 0){
                System.out.print(i+" ");
            }
        }
    }
}
