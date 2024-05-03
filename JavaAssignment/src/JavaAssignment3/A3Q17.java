package JavaAssignment3;

import java.util.Scanner;

//Q.Volume Of Sphere
public class A3Q17 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double radius, Volume , cube;
        System.out.println("Enter the radius of Sphere: ");
        radius = input.nextInt();
        if(radius>0){
            float half = 1/3f;
            cube = radius * radius * radius;
            Volume = 4* half * Math.PI * cube;
            int ans = (int) Volume;
            System.out.println("Volume Of Sphere: "+ans);
        }
    }
}
