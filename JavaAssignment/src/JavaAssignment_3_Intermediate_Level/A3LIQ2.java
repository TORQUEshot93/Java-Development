package JavaAssignment_3_Intermediate_Level;

import java.util.Scanner;

//Q.Calculate Electricity Bill
public class A3LIQ2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the units to calculate the elcetricity bill: ");
        int units = input.nextInt();
        double billtoPAY = 0;
        if(units < 100){
            billtoPAY = units * 1.20;
        } else if (units < 300) {
            billtoPAY = 100*1.20 + (units -100);
        }else if (units > 300){
            billtoPAY = 100 * 1.20 + 200 * 2 +(units-300)*3;
        }
        System.out.println("The electricity bill for" +units+"is: "+billtoPAY);
    }
}
