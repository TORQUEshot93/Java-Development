package Number_exercise;

public class MyNumber_execution {
    public static void main(String[] args) {
        MyNumber number = new MyNumber(9);

        System.out.println(number.isPrime(5));

        int sum = number.sumUptoN(9);
        System.out.println("sum:"+sum);
//
        int sumOfDivisor = number.sumOfDivisor(9);
        System.out.println("Sum of Divisor:"+sumOfDivisor);
//
        number.printANumberTriangle(9);


    }
}
