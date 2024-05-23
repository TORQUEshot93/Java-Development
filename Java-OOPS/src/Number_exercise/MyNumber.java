package Number_exercise;

public class MyNumber {
        private int num;

    public MyNumber(int i) {
        this.num = i;
    }

    public boolean isPrime(int n){
        if(n <= 1){
            return false;
        }
        //
        for(int i = 2; i < n;i++){
            if(i % 2 == 0){
                return false;
            }
        }
        //
        return true;
    }
    //
    public int sumUptoN(int n){
        int sum = 0;
        for(int i = 0; i < n;i++){
            sum = sum + i;
        }
        return sum;
    }
    //
    public int sumOfDivisor(int n){
        int sumdiv = 0;
        for( int i = 2 ; i < n ; i++ ){
            if(n % i == 0){
                sumdiv =+ i;
            }
        }
        return sumdiv;
    }
    //
    public void printANumberTriangle(int n){
        for ( int i = 0 ; i <= n ; i++ ){
            for(int j = 1 ; j <= i; j++){
                System.out.print(j+" ");
            }
            System.out.println();
        }
    }
}
