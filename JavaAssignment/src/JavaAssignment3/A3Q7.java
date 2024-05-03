package JavaAssignment3;

import java.util.Scanner;

//Q.Area Of Equilateral Triangle
//Method to solve square root
//  1.Math.pow(num, 0.5);
//  2.Math.sqrt(num);
public class A3Q7 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        float Area,sqrt,side;
        System.out.print("Enter the side lenght of traingle: ");
        side = input.nextInt();
        sqrt = (float) Math.sqrt(3);
        if (side>0){
            Area = sqrt/4 * side * side;
            System.out.println("Area of Equilateral triangle: "+Area);
        }
    }
}
