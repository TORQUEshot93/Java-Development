package JavaAssignment4;

import java.util.Scanner;

//Q.Define a method to find out if a number is prime or not.
public class A4Q6 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number to find whether it is prime or not:");
        int num = input.nextInt();
        String ans = Prime(num);
        System.out.println("Entered Number:"+num);
        System.out.println(ans);
    }
    //
    static String Prime(int num){
        String ans = "none";
        if (num <= 1)
            ans = "Not a prime Number";

        // Check from 2 to n-1
        for (int i = 2; i < num; i++)
            if (num % i == 0)
                ans = "Not a prime Number";

        ans = "It is a prime Number";
        return ans;
    }
}
