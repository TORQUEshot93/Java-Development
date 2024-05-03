package JavaAssignment3;

import java.util.Scanner;

//Q.Volume Of Prism
public class A3Q15 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int Base,height;
        System.out.println("Enter the base of the prism: ");
        Base = input.nextInt();
        System.out.println("Enter the height of the prism: ");
        height = input.nextInt();
        if(Base>0){
            int ans = Base * height;
            System.out.println("Entter Of Prism: "+ans);
        }
    }
}
