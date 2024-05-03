package JavaAssignment_3_Intermediate_Level;

import java.util.Scanner;

//Q.Power In Java
public class A3LIQ7 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int num = input.nextInt();
        System.out.print("Enter the power for the number: ");
        int power_num = input.nextInt();
        if(num>0){
            double power = Math.pow(num,power_num);
            System.out.println("Power of the Number: "+num+" Power: "+power_num+" Total Power:"+power);
        }
    }
}
