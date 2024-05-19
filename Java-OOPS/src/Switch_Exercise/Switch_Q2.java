package Switch_Exercise;

import java.util.Scanner;

public class Switch_Q2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the Month Number: ");
        int monthNumber  = input.nextInt();
        System.out.println("Name of the Month");
        determineNameOfMonth(monthNumber);
    }
    //
    public static void determineNameOfMonth(int monthNumber){
        String ans = "none";
        switch (monthNumber){
            case 1:
                System.out.println("January");
                break;
            case 2:
                System.out.println("February");
                break;
            case 3:
                System.out.println("march");
                break;
            case 4:
                System.out.println("april");
                break;
            case 5:
                System.out.println("may");
                break;
            case 6:
                System.out.println("June");
                break;
            case 7:
                System.out.println("July");
                break;
            case 8:
                System.out.println("August");
                break;
            case 9:
                System.out.println("sep");
                break;
            case 10:
                System.out.println("oct");
                break;
            case 11:
                System.out.println("Nov");
                break;
            case 12:
                System.out.println("Dec");
                break;
            default:
                System.out.println("Invalid Number");
                break;
        }
    }
}
