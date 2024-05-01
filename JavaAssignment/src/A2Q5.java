import java.util.Scanner;

//Q.Take 2 numbers as input and print the largest number.
public class A2Q5 {
    public static void main(String[]  args){
        Scanner input =new Scanner(System.in);
        System.out.println("Enter any two number: ");
        int num1 = input.nextInt();
        int num2 = input.nextInt();
        int max = num1;
        if(num2>max){
            max = num2;
        }
        System.out.println("Largest number is: "+max);
    }
}
