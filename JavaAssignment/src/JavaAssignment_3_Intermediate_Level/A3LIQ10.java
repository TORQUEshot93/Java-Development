package JavaAssignment_3_Intermediate_Level;
//Q.Calculate CGPA Java Program [CGPA= 9.5 × CGPA]
import java.util.Scanner;

public class A3LIQ10 {
    public static void main(String[] args) {
        double English, Hindi, Maths, Science, SocialStudy, CGPA, CGPAper , Total_Subjects ;
        Scanner input = new Scanner(System.in);
        System.out.print("English: ");
        English = input.nextFloat();
        System.out.print("Hindi: ");
        Hindi = input.nextFloat();
        System.out.print("Maths: ");
        Maths = input.nextFloat();
        System.out.print("Science: ");
        Science = input.nextFloat();
        System.out.print("SocialStudy: ");
        SocialStudy = input.nextFloat();
        System.out.print("Enter Total Number od Subjects: ");
        Total_Subjects = input.nextFloat();
        CGPA = (English+Hindi+Maths+Science+SocialStudy)/(Total_Subjects);
        CGPAper = (float)(9.5 * (CGPA));
        System.out.print("CGPA percentage is: "+CGPAper);
    }
}
