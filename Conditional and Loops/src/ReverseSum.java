import java.util.Scanner;

public class ReverseSum {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int number = input.nextInt();
        int Reverse = 0;
        while(number > 0){
            int rem = number % 10;
            number = number/10;

            Reverse = Reverse * 10 + rem;
        }
        System.out.println(Reverse);
    }
}
