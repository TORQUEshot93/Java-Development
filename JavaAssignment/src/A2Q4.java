import java.util.Scanner;

//Q. Take in two numbers and an operator (+, -, *, /) and calculate the value. (Use if conditions)
public class A2Q4 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter any two numbers: ");
        int num1 = input.nextInt();
        int num2 = input.nextInt();
        int ans = 0;
        System.out.println("Enter the operator to perform the operation: ");
        char operator = input.next().charAt(0);
        if(operator == '+'){
           ans = num1 + num2;
        }
        else if(operator == '-'){
            ans = num1 - num2;
        }
        else if(operator == '*'){
            ans = num1 * num2;
        }
        else if(operator == '/'){
                if(num2 != 0) {
                  ans = num1 / num2;
                }
        }else{
            System.out.println("Invalid operator!");
        }
        System.out.println("The Answer of the entered number is: "+ans);

    }
}
