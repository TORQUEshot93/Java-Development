package JavaAssignment3;

import java.util.Scanner;
//Q.Perimeter Of Square
public class A3Q12 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the side of Square: ");
        int side = input.nextInt();
        if (side>0){
            int ans = 4 * side;
            System.out.print("Perimeter of Square: "+ans);
        }
    }
}
