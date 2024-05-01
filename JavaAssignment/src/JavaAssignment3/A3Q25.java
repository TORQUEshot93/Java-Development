package JavaAssignment3;

import java.util.Scanner;

//Q.Take integer inputs till the user enters 0 and print the largest number from all.
public class A3Q25 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int sum = 0 , x = 0 , max = 0 ;
        System.out.print("Enter the number to add: ");
        x = input.nextInt();
        while(x > 0){
            if(x > 0){
                sum = sum + x;
            }else{
                System.out.println("no data was entered!");
            }
            //Largest number:
            if(x > max){
                max = x;
            }

            x = input.nextInt();
        }
        System.out.println("Sum: "+sum);
        System.out.println("Largest number among them is: "+max);

    }
}
