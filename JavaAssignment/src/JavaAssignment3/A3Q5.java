package JavaAssignment3;

import java.util.Scanner;

//Q. Area Of Parallelogram
public class A3Q5 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int height,base,Area;
        System.out.print("Enter the height of Parallelogram: ");
        height = input.nextInt();
        System.out.print("Enter the base of Parallelogram: ");
        base = input.nextInt();
        if ( height > 0){
            Area = base * height;
            System.out.println("Area of Parallelogram: "+Area);
        }
    }
}
