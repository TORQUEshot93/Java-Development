import java.util.Scanner;

public class Main{
  public static void main(String[] args){
      int ans = sum();
      System.out.println(ans);
  }

  static int sum(){
      Scanner input = new Scanner(System.in);
      System.out.print("Enter the first number: ");
      int num = input.nextInt();
      System.out.print("Enter the second number: ");
      int num2 = input.nextInt();
      int sum = num + num2;
//      System.out.println("The sum: "+sum);
      return sum;
  }
}