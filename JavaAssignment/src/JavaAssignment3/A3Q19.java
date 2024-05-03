package JavaAssignment3;

import java.util.Scanner;

//Q.Curved Surface Area Of Cylinder
public class A3Q19 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int height , radius, Surface_area;
        System.out.println("Enter the height of Cylinder: ");
        height = input.nextInt();
        System.out.println("Enter the radius of Cylinder: ");
        radius = input.nextInt();
        if (height>0){
            Surface_area = 2 * height * radius;
            System.out.println("Curved Surface Area Of Cylinder: "+Surface_area);
        }
    }
}
