import java.util.Arrays;

public class VarArgs {
    public static void main(String[] args){
        fun(1,2,3,4,5,6,7,8);
        multiple(10,20,"Omkar","Pooja","Laxman");
    }
    static void multiple(int a,int b,String ...v){
        System.out.println(a + b);
    }
    static void fun(int ...v){
        System.out.println(Arrays.toString(v));
    }
}
