package JavaAssignment3;
//Q.11 Perimeter Of Rectangle
import java.util.Scanner;

public class A3Q11 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the length of Rectangle: ");
        int length = input.nextInt();
        System.out.print("Enter the width of Rectangle: ");
        int width = input.nextInt();
        if(length>0){
         int ans = 2 * (length + width);
         System.out.println("Perimeter of Rectangle: "+ans);
        }
    }
}
