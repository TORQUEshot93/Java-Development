package JavaAssignment3;

import java.util.Scanner;

//Q.Perimeter Of Parallelogram
public class A3Q10 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int side,base,Perimeter;
        System.out.print("Enter the side lenght of Parallelogram: ");
        side = input.nextInt();
        System.out.print("Enter the base of Parrallelogram: ");
        base = input.nextInt();
        if(side>0){
            Perimeter = 2 * ( side + base);
            System.out.println("Perimeter Of Parallelogram: "+Perimeter);
        }
    }
}
