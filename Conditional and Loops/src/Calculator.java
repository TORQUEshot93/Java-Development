import java.util.Scanner;

public class Calculator {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        // Take input from user till user does not press 'x' or 'X'
        int ans = 0;
        while(true){
            //take the operator as input
            System.out.print("Enter the operator: ");
            char op = input.next().trim().charAt(0);

            if(op == '+' || op == '-' || op == '*' || op == '/' || op =='%'){
                // input any two numbers
                System.out.print("Enter any two numbers: ");
                int num1 = input.nextInt();
                int num2 = input.nextInt();

                if (op == '+') {
                    ans = num1 + num2;
                }
                if (op == '-') {
                    ans = num1 - num2;
                }
                if (op == '*') {
                    ans = num1 * num2;
                }
                if (op == '/') {
                    if( num2 != 0){
                        ans = num1 / num2;
                    }
                }
                if (op == '%') {
                    ans = num1 % num2;
                }
            } else if (op == 'x' || op == 'X') {
                break;
            } else {
                System.out.println("Invalid operstor!");
            }
            System.out.println(ans);
        }
    }
}
