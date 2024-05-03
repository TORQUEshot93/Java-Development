package JavaAssignment2;// Q.5 Keep taking numbers as inputs till the user enters ‘x’, after that print sum of all.

import java.util.Scanner;

public class Assignment1Q5 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int sum = 0;
        System.out.println("Enter numbers to add or (enter 'x' to stop): ");
        while(true){
            String var = input.nextLine();
            if (var.equals("x")){
                break;
            }
                int num = input.nextInt();
                sum = sum + num;

        }
        System.out.println("Sum of the numbers: "+sum);
    }
}


//public static void main(String[] args) {
//
//    Scanner scanner = new Scanner(System.in);
//
//    int sum = 0;
//
//    System.out.println("Enter numbers (enter 'x' to stop):");
//
//    while (true) {
//
//        String input = scanner.nextLine();
//
//        if (input.equals("x")) {
//
//            break;
//
//        }
//
//        int number = Integer.parseInt(input);
//
//        sum += number;
//
//    }
//
//    System.out.println("Sum of the numbers: " + sum);
//
//}