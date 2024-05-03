package JavaAssignment3;

import java.util.Scanner;

//Q.1 Area Of Circle Java Program.
public class A3Q1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double radius,area;
        System.out.print("Enter the Radius to find the Area of the circle:");
        radius = input.nextInt();

        if(radius > 0){
            area =  Math.PI * radius * radius;
            System.out.print("Area of the entered radius is: "+area);

        }

    }
}
