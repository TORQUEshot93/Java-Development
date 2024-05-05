package JavaAssignment4;

import java.util.Scanner;

//Q.Define two methods to print the maximum and the minimum number respectively among three numbers entered by the user.
public class A4Q1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the first number: ");
        int num1 = input.nextInt();
        System.out.print("Enter the second number: ");
        int num2 = input.nextInt();
        System.out.print("Enter the third number: ");
        int num3 = input.nextInt();
        int Maximum = Max(num1,num2,num3);
        int Minimum = Min(num1,num2,num3);
        System.out.println("Maximum number: "+Maximum+" and Minimum Number:"+Minimum);
    }
    //
    //
    static int Max(int firstn, int secondn , int thirdn){
        int maxi = 0 ;
        if(maxi < firstn ){
            maxi = firstn;
            if (maxi < secondn) {
                maxi = secondn;
                if(maxi < thirdn){
                    maxi = thirdn;
                }
            }
        }
        return maxi;
    }
    //
    static int Min(int firstn, int secondn , int thirdn){
        int mini = 100 ;
        if(mini > firstn ){
            mini = firstn;
            if (mini > secondn) {
                mini = secondn;
                if(mini > thirdn){
                    mini = thirdn;
                }
            }
        }
        return mini;
    }
}
