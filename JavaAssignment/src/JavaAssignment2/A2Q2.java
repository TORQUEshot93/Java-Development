package JavaAssignment2;

import java.util.Scanner;

//Q. Take name as input and print a greeting message for that particular name.
 public class A2Q2 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Please enter your name:");
        String name = input.nextLine();
        System.out.println("Hello "+name+" how are you! ");
    }
}
