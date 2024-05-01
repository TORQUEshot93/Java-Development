package JavaAssignment_3_Intermediate_Level;

import java.util.Scanner;
//Q.Calculate Discount Of Product
// Discount = List price x Discount Rate
public class A3LIQ4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the name of the Product: ");
        String product  = input.next();
        System.out.print("Enter the price of Product: ");
        int List_price = input.nextInt();
        System.out.print("Enter the Discount of the Product: ");
        float Discount_rate = 0;
        Discount_rate = input.nextInt();
        if( List_price > 0 ){
            float percentage_Discount = (Discount_rate / 100);
            float Discount = List_price * percentage_Discount;
            float Final_Discount_Rate = List_price - Discount;
            System.out.print("Amount after Disount: "+Final_Discount_Rate);
        }
    }
}
