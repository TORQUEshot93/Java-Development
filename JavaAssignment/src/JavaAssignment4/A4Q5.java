package JavaAssignment4;

import java.util.Scanner;

//Q.Write a program to print the circumference and area of a circle of radius entered by user by defining your own method.
//circumference of circle = 2πr
//Area of Circle = πr(power2)
public class A4Q5 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the Radius od the Circle:");
        double radius = input.nextInt();
        double ans1 = Circumference(radius);
        double ans2 = Area(radius);
        System.out.println("Circumference of the Circle is:"+ans1);
        System.out.print("Area of the Circle:"+ans2);
    }
    //
    static double Circumference(double num){
        double circumference = 2 * Math.PI * num;
        return circumference;
    }
    //
    static double Area(double num2){
        double area = Math.PI * Math.pow(num2,2);
        return area;
    }
}
