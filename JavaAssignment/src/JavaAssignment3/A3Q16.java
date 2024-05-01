package JavaAssignment3;
//Q.Volume Of Cylinder
import java.util.Scanner;

public class A3Q16 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double radius, height ,square , Volume;
        System.out.print("Enter the radius of Cylinder: ");
        radius  = input.nextInt();
        System.out.print("Enter the height of Cylinder: ");
        height = input.nextInt();
        if (radius>0){
            square = radius * radius;
            Volume = Math.PI * square * height;
            int ans =(int) Volume;
            System.out.print("Volume of Cylinder: "+ans);
        }
    }
}
