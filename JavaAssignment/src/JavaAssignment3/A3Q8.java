package JavaAssignment3;

import java.awt.geom.Area;
import java.util.Scanner;

//Q.8 Perimeter Of Circle
public class A3Q8 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double radius,Perimeter;
        System.out.print("Enter the radius of Circle: ");
        radius = input.nextInt();
        if (radius > 0){
            Perimeter = 2 * Math.PI * radius;
//            int ans = (int)Perimeter;
            System.out.print("Perimeter Of Circle: "+ Perimeter);
        }
    }
}
