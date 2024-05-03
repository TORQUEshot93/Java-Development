package JavaAssignment3;
//Q.2 Area Of Triangle.
import java.util.Scanner;

public class A3Q2 {
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        float height,breadth,Area;
        System.out.print("Enter the height of triangle: ");
        height = input.nextInt();
        System.out.print("Enter the breadth of triangle: ");
        breadth = input.nextInt();
        while(height > 0){
            float half = 1/2f;
            Area =  half * height * breadth;
            int ans = (int)Area;//conversion of data type from float to int
            System.out.print("Area of Trianglr is: "+ans);
        }
    }
}
