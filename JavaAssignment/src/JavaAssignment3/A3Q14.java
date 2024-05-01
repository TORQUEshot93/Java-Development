package JavaAssignment3;
//Q.volume of cone
import java.util.Scanner;

public class A3Q14 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double height,radius,r_square,volume;
        float half = 1/3f;
        System.out.print("Enter the height of cone: ");
        height = input.nextInt();
        System.out.print("Enter the radius of cone: ");
        radius = input.nextInt();
        if(height>0){
            r_square = radius * radius;
            volume = half * Math.PI * r_square * height;
            System.out.println("Volume of Cone: "+volume);
        }
    }
}
