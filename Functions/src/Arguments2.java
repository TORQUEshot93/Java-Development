import java.util.Scanner;

public class Arguments2 {
    public static void main(String[] args){
        System.out.println("Enter your name: ");
        Scanner input = new Scanner(System.in);
        String name = input.next();
        String Message = mygreet(name);
        System.out.println(Message);
    }
    static String mygreet(String name){
        String message = "how are you " + name;
        return message;
    }
}
