package JavaAssignment2;

import java.util.Scanner;

//Q.To find Armstrong Number between two given number.
public class A2Q9 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int num = input.nextInt();
        System.out.println(isArmstrong(num));
    }
    static boolean isArmstrong(int n){
        int original = n;
        int sum = 0;
        while(n > 0){
            int rem = n % 10;
            n = n / 10;
            int cube = rem*rem*rem;
            sum = sum + cube;
        }
        return sum == original;
    }
}
