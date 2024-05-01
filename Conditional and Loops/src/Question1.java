import java.util.Scanner;

public class Question1{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int a = input.nextInt();
        int b = input.nextInt();
        int c = input.nextInt();
//        if (a > b){
//            System.out.println(a);
//        }else if (b > c){
//            System.out.println(b);
//        }else{
//            System.out.println(c);
//        }
        int Max = a;
        if(b > Max){
            Max = b;

        } else if (c > Max) {
            Max = c;

        }
        System.out.println(Max);
    }
}