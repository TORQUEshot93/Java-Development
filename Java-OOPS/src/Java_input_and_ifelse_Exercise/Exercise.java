package Java_input_and_ifelse_Exercise;

import jdk.dynalink.Operation;

import java.util.Scanner;

public class Exercise {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the first number: ");
        int num1= input.nextInt();
        System.out.print("Enter the secind Number: ");
        int num2 = input.nextInt();
        System.out.println("1 - ADD " + "\n" + "2 - Subtract " + "\n" + "3 - Divide" + "\n" + "4 - Multiply");
        System.out.print("Choose any specific Operation from the above operation's to perform opertion on nums: ");
        int selection_option = input.nextInt();
        System.out.println("Choosed Operation is: "+selection_option);
        int sol = chooseOperation(selection_option,num1,num2);
        System.out.println(sol);
    }
    //
    public static int chooseOperation(int selection,int num_1,int num_2){
        int ans = 0;
        if (selection == 1) {
            ans= num_1 + num_2;
        } else if (selection == 2) {
            ans = num_1 - num_2;
        } else if (selection == 3) {
            if(num_1 != 0 )
              ans = num_1 / num_2;
        } else if (selection == 4) {
            ans = num_1 * num_2;
        }else {
            System.out.print("InValid Operation Selection Entered! Please Enter the Correct Operation number");
            return -1;
        }
        return ans;
    }
}
