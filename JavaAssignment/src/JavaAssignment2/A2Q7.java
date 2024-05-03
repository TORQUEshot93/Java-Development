package JavaAssignment2;

import java.util.Scanner;

//Q.To calculate Fibonacci Series up to n numbers.
public class A2Q7 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int num = input.nextInt();
        int a = 0;
        int b = 1;
        int count = 2;
        while(count<=num){
            int c = b;
            b = a + b;
            a = c;
            count++;
        }
        System.out.println(b);
    }
}
