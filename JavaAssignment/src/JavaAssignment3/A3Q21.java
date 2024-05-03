//Q.Fibonacci Series In Java Programs
package JavaAssignment3;

import java.util.Scanner;

public class A3Q21 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num_1, num_2, count, num_3;
        num_1 = 0;
        num_2 = 1;
        System.out.print("Enter the number you want to print the Fibonacci series till: ");
        count = input.nextInt();
        System.out.print(num_1+" "+num_2);
        for (int i = 2; i < count ; i++) {
            num_3 = num_1 + num_2;
            System.out.print(" "+num_3);
            num_1 = num_2;
            num_2 = num_3;
        }
    }
}
