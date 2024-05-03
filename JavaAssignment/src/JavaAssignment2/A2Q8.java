package JavaAssignment2;

import java.util.Scanner;

//Q.To find out whether the given String is Palindrome or not.
public class A2Q8 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int num = input.nextInt();
        int reverseN = reverseNumber(num);
        System.out.println("Reverse of numbber is: "+reverseN);

        if(num == reverseN){
            System.out.println("Palindrome = Yes");
        }else{
            System.out.println("Palindrome = No");
        }
    }

    static int reverseNumber(int n){
          int reversed_n = 0;
          while(n > 0){
              reversed_n = reversed_n * 10 + n % 10;
              n = n / 10;
          }
          return reversed_n;
    }
}
