package JavaAssignment3;

import java.util.Scanner;

//Q.3 Area Of Rectangle Program
public class A3Q3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int length,width,Area;
        System.out.print("Enter length of the rectangle: ");
        length = input.nextInt();
        System.out.print("Enter width of the rectangle: ");
        width = input.nextInt();
        if (length > 0){
           Area = length * width;
            System.out.println("Area of Circle is: "+Area);
        }
    }
}
