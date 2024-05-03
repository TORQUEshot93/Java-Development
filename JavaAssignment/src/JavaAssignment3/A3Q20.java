package JavaAssignment3;

import java.util.Scanner;

public class A3Q20 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int side_lenght_cube , Area;
        System.out.println("Enter the side lenght of the Cube: ");
        side_lenght_cube = input.nextInt();
        if ( side_lenght_cube > 0){
            Area = 6 * side_lenght_cube;
            System.out.println("Total Surface Area Of Cube: "+Area);
        }
    }
}
