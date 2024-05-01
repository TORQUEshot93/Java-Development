package JavaAssignment3;

import java.util.Scanner;

//Q.Volume Of Pyramid
public class A3Q18 {
    public static void main(String[] args) {
        Scanner input =  new Scanner(System.in);
        float height , base , Volume;
        System.out.println("Enter the height of Pyramid: ");
        height = input.nextInt();
        System.out.println("Enter the base of Pyramid: ");
        base = input.nextInt();
        if(height>0){
            float half = 1/3f;
            Volume = half * base +height;
            int ans = (int) Volume;
            System.out.println("Volume Of Pyramid: "+ans);
        }
    }
}
