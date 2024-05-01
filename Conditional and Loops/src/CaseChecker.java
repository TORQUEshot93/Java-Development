import java.util.Scanner;

public class CaseChecker {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        char ch = input.next().trim().charAt(0);
        if(ch >= 'a' && ch <= 'b'){
            System.out.println("Lowercase");
        }else{
            System.out.println("Uppercase");
        }
        System.out.println(ch);
    }
}
