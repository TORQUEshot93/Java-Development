package JavaAssignment4;

import java.util.Scanner;
//Q.Define a method that returns the product of two numbers entered by user.
//Q.Write a program to print the sum of two numbers entered by user by defining your own method.
public class A3Q4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the first number: ");
        int num1 = input.nextInt();
        System.out.println("Enter the second number: ");
        int num2 = input.nextInt();
        int ans = sum(num1,num2);
        int ans2 = multiple(num1,num2);
        System.out.println("Sum of the numbe:"+ans);
        System.out.println("Mutiplication of the number:"+ans2);
    }
    //
    static int sum(int first,int second){
        return first + second;
    }
    //
    static int multiple(int first,int second){
        return first * second;
    }
}
