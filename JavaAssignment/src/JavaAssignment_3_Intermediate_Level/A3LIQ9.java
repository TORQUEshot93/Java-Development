package JavaAssignment_3_Intermediate_Level;

import java.util.Scanner;

//Q.Calculate Batting Average
//nBatting Average (BA) = Total Runs Scored / Total Outs
public class A3LIQ9 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
//        System.out.print("Enter the Total numbers of Runs Scored: ");
//        int Total_runs = input.nextInt();
//        System.out.print("Enter total number of outs:");
//        int Total_out = input.nextInt();
//        if(Total_runs>0){
//            int Batting_Average = Total_runs / Total_out;
//            System.out.print("Batting Average is: "+Batting_Average);
//        }
        int[] runs_scored = {50, 30, 0, 45, 60};
        System.out.print("Enter total number of outs: ");
        int outs = input.nextInt();
        int Total_runs = 0;
        for(int runs:runs_scored){
            Total_runs += runs ;
        }
        int Batting_Average = Total_runs / outs;
        System.out.println("Batting Avergae: "+Batting_Average);
    }
}
