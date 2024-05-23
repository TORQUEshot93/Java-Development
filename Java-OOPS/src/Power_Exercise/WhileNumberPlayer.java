package Power_Exercise;

public class WhileNumberPlayer {
    private int num;

    public WhileNumberPlayer(int i) {
        this.num = i;
    }
    //
    public void printSquareUptoLimit(int num){
        for (int i = 1;i < num; i++){
            int square = 0 ;
            square = i * i;
            if (square <= num ){
                System.out.print(square +" ");
            }
        }
    }
    //
    public void printCubesUptoLimit(int num){
        for (int i = 1;i < num; i++){
            int cube = 0 ;
            cube = i * i * i;
            if (cube <= num ){
                System.out.print(cube +" ");
            }
        }
    }
}
