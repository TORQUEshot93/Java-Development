package JavaAssignment3;
// Q.Perimeter Of Rhombus
import java.util.Scanner;

public class A3Q13 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the side of Rhombus: ");
        int side = input.nextInt();
        if (side>0){
            int ans = 4 * side;
            System.out.print("Perimeter of Rhombus: "+ans);
        }
    }
}
