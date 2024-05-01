public class Overloading {
    public static  void main(String[] args) {
//        fun(93);
//        fun("Omkar Patil");
//    }
//
//    static void fun(int a){
//       System.out.println(a);
//    }
//
//    static void fun(String name){
//        System.out.println(name);
//    }
        int add = sum(2,3,4);
        System.out.println(add);
    }

    static int sum(int a ,int b){
        return a + b;
    }

    static int sum(int a,int b,int c){
        return a+b+c;
    }
}
