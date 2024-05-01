import java.util.Scanner;

public class FunctionMethodQ2 {
    public static void main(String[] args){
//        Scanner input = new Scanner(System.in);
//        int n = input.nextInt();
        for (int i=100;i<1000;i++){
            if(isarmstrong(i)){
                System.out.println(i);
            }
        }
//        boolean ans = isarmstrong(n);
//        System.out.println(ans);
    }

    static boolean isarmstrong(int n){
        int original = n;
        int sum = 0;
        while(n > 0){
            int rem = n % 10;
            n = n / 10;
            int cube = rem*rem*rem;
            sum = sum + cube;
        }
        return sum == original;
    }
}
