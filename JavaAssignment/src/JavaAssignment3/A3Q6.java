package JavaAssignment3;

import java.util.Scanner;

//Q.Area Of Rhombus
public class A3Q6 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        float p,q,half,Area;
        System.out.print("Enter the lenght of the first Diagonal(p): ");
        p = input.nextInt();
        System.out.print("Enter the lenght of the second Diagonal(q): ");
        q = input.nextInt();
        if (p > 0){
            half = 1/2f;
            Area = half * p * q;
            int ans = (int)Area;
            System.out.println("Area of Rhombus: "+ans);
        }
    }
}
