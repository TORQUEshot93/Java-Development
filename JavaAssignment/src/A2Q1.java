import java.util.Scanner;

// Q1.Write a program to print whether a number is even or odd, also take input from the user.
public class A2Q1 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int num = input.nextInt();
        if( num % 2 == 0){
            System.out.println(num +" Is a Even Number");
        }else{
            System.out.println(num +" Is a Odd Number");
        }
    }
}
