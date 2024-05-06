package JavaAssignment4;

import java.util.Scanner;

//Q.A person is eligible to vote if his/her age is greater than or equal to 18. Define a method to find out if he/she is eligible to vote.
public class A4Q3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the age of the person: ");
        int age = input.nextInt();
        String ans = Eligibility(age);
        System.out.print(ans);
    }
    //
    static String Eligibility(int age_num){
        String ans ="none";
        if(age_num >= 18 ){
             ans = "Eligible to vote";
        }else{
             ans = "Not a ELigible to vote";
        }
        return ans;
    }
}
