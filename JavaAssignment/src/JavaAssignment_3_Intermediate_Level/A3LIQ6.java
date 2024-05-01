package JavaAssignment_3_Intermediate_Level;

import java.util.Scanner;

//Q.Calculate Commission Percentage
public class A3LIQ6 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the amount you made: ");
        double amount = input.nextInt();
        System.out.print("Enter comission percentage: ");
        double comission_percentage = input.nextInt();
        if ( amount > 0 ){
            double comission = (comission_percentage/100)*amount;
            System.out.print("Comission amount: "+comission);
        }
    }
}
