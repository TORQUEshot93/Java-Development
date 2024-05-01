package JavaAssignment_3_Intermediate_Level;

import java.util.Scanner;

//Q.Calculate Distance Between Two Points
public class A3LIQ5 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double x1, x2, y1, y2;
        System.out.print("Enter the x1: ");
        x1 = input.nextInt();
        System.out.print("Enter the y1: ");
        y1 = input.nextInt();
        System.out.print("Enter the x2: ");
        x2 = input.nextInt();
        System.out.print("Enter the y2: ");
        y2 = input.nextInt();
        double ans = Distance(x1,x2,y1,y2);
        System.out.print(ans);
    }
    //
    static double Distance(double x1 , double x2,double y1, double y2){
        double sol = Math.sqrt(Math.pow((x2 - x1), 2) +Math.pow((y2-y1),2));
        return sol;
    }
}
