package JavaAssignment_3_Intermediate_Level;

import java.util.Scanner;

//Q.Calculate Depreciation of Value
public class A3LIQ8 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        float V1 , R , T;
        System.out.print("Enter the initial value: ");
        V1 = input.nextFloat();
        System.out.print("Rate of Depreciation: ");
        R = input.nextFloat();
        System.out.print("Time: ");
        T = input.nextFloat();
        System.out.println(Depreciation(V1,R,T));
    }
    //
    static float Depreciation(float v,float r,float t){
        float v2 = (float)(v*(Math.pow((1-r/100),t)));

        return v2;
    }
}
