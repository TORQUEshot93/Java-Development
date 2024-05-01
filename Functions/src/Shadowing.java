import java.sql.SQLOutput;

public class Shadowing {
    static int x = 40;// this will be shadowed at line 8
    public static void main(String[] args) {
        System.out.println(x); //40
        int x = 50;//the class variable at line 4 is shadowed by this
        System.out.println(x);//scope will begin when value is innitialised
        fun();
    }

    static void fun(){
        System.out.println(x);
    }
}
