import java.util.Scanner;

public class NumCounter {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int number = input.nextInt();
        int numcheck = input.nextInt();
        int count = 0;
        while(number > 0){
            int rem = number % 10;
            if(rem == numcheck){
                count++;
            }
            number = number / 10;
        }
        System.out.println(count);
    }
}
