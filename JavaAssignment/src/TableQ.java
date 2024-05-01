import java.util.Scanner;

public class TableQ {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num = input.nextInt();
        for (int i = 0; i <= 12; i++) {
            int table = num * i;
            String ans = (num + " * " + i + " = " + table);
            System.out.println(ans);
        }
    }
}