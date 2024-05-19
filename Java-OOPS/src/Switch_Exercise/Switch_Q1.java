package Switch_Exercise;

import java.util.Scanner;

public class Switch_Q1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the Day Number: ");
        int dayNumber = input.nextInt();
        Boolean ans = isWeekDay(dayNumber);
        System.out.println(ans);
    }
    //
    public static boolean isWeekDay(int dayNumber){
        switch (dayNumber){
            case 0:
                System.out.println("Sunday(It's WeeekEnd)");
                return false;
            case 1:
                System.out.println("Monday(It's WeekDay)");
                return true;
            case 2:
                System.out.println("Tuesday(It's WeekDay)");
                return true;
            case 3:
                System.out.println("Wednesday(It's WeekDay)");
                return true;
            case 4:
                System.out.println("Thursday(It's WeekDay)");
                return true;
            case 5:
                System.out.println("Friday(It's WeekDay)");
                return true;
            case 6:
                System.out.println("Saturday(It's WeekEnd)");
                return false;
            default:
                System.out.println("Invalid Number Entered)");
                return false;
        }
    }
}
