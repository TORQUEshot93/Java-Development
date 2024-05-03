package JavaAssignment3;

import javax.xml.transform.Result;
import java.util.Scanner;

//Q.Subtract the Product and Sum of Digits of an Integer
public class A3Q22 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n , Result = 0, rem, product_of_digits = 1 , sum_of_digit = 0,reverse_num = 0;
        System.out.print("Enter the number: ");
        n = input.nextInt();
        while( n > 0 ){
             int reverse = n % 10;
             n = n / 10;
             reverse_num = reverse_num * 10 + reverse;
        }
        int new_reverse = reverse_num;
        
        while(reverse_num > 0){
             //
             rem = reverse_num % 10;
             reverse_num = reverse_num / 10;
             product_of_digits = product_of_digits * rem;
             //
        }
        while(new_reverse > 0){
            rem = new_reverse % 10;
            new_reverse = new_reverse / 10;
            sum_of_digit = sum_of_digit + rem;
        }
        System.out.println("product_of_digits: " +product_of_digits);
        System.out.println("sum_of_digit: "+sum_of_digit);
        
        if(product_of_digits > sum_of_digit){
            Result = product_of_digits - sum_of_digit;
        }
        System.out.println("Result: "+ Result);
    }
}
//easy solution
//int sum=0,product=1;
//        while (n>0){
//           int rem=n%10;
//           sum=sum+rem;
//           product=product*rem;
//           n=n/10;
//        }
//        return product-sum;
