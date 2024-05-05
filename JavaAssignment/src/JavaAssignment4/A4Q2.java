package JavaAssignment4;

import java.util.Scanner;

//Q.Define a program to find out whether a given number is even or odd.
public class A4Q2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number:");
        int num = input.nextInt();
        String ans = check(num);
        System.out.println("The number is: "+ans);
    }
    //
    static String check(int num){
        String ans = "none";
        if(num%2 == 0){
            ans = "even";
        }else{
            ans = "odd";
        }
        return ans;
    }
}

