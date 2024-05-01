package JavaAssignment3;

import java.util.Scanner;

//Q.4 Area Of Isosceles Triangle
public class A3Q4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        float area,height,base,half;
        int ans;
        System.out.print("Enter the height of triangle: ");
        height = input.nextInt();
        System.out.print("Enter thr base of triangle: ");
        base = input.nextInt();
        if(height > 0){
            half = 1/2f;
            area = half * height * base;
            ans = (int)area;
            System.out.print("Area of the Isosceles triangle: "+ ans);
        }
    }
}
