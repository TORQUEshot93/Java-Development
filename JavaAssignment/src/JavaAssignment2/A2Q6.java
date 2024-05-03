package JavaAssignment2;

import java.util.Scanner;

//Q.Input currency in rupees and output in USD.
public class A2Q6 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        double exchangerate = 0.013;
        System.out.print("Enter the amount in Indian Ruppes(INR): ");
        double currency = input.nextInt();
        double amountInUSD = currency * exchangerate;
        System.out.println("Equivalent amount in US Dollars (USD): $ " + amountInUSD);


    }
}
