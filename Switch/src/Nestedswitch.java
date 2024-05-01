import java.util.Scanner;

public class Nestedswitch {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int empid = input.nextInt();
        String department = input.next();
        switch(empid){
            case 1:
                System.out.println("Omkaar Patil");
                break;
            case 2:
                System.out.println("Aryan Ghuge");
                break;
            case 3:
                System.out.println("Nilesh Phadtare");
                switch(department){
                    case "IT":
                        System.out.println("IT Department");
                        break;
                    case "Finance":
                        System.out.println("Finannce Department");
                        break;
                }
                break;
            default:
            System.out.println("No department");
            break;
        }
    }
}
