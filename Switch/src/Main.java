import java.util.Scanner;

public class Main{
    public static  void main(String[] args){
          Scanner input = new Scanner(System.in);
//        String fruit = input.next();
//
//        switch(fruit){
//            case "Mango":
//                System.out.println("King of fruits");
//                break;
//            case "Banana":
//                System.out.println("Lonng fruit");
//            case "Jackfruit":
//                System.out.println("sweet");
//            case "Apple":
//                System.out.println("Doctor fruit");
//            case "Grapes":
//                System.out.println("tangi");
//            default:
//                System.out.println("Invalid fruit");
//        }
        int day = input.nextInt();

        switch (day){
            case 1,2,3,4,5 -> System.out.println("Weekdays");
            case 7,8 -> System.out.println("Weekends");
        }
    }
}