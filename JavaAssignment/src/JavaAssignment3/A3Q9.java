package JavaAssignment3;

import java.util.Scanner;

//Q.Perimeter Of Equilateral Triangle
public class A3Q9 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int side,Perimeter;
        System.out.print("Enter side length of triangle: ");
        side = input.nextInt();
        if (side > 0){
            Perimeter = 3 * side;
            System.out.println("Perimeter Of Equilateral Triangle: "+Perimeter);
        }
    }
}
