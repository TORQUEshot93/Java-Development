public class Scope {
    public static void main(String[] args){
        int a = 10;
        int b = 20;
        String name = "Omkar";
        {
//            int a = 79;
            // already intialised outside the block in the same method,hence you cannot initialise it again
            a = 100; // reassign the origin ref variable to some other value
            System.out.println(a);
            int c = 99;
            name = "Pooja";
            System.out.println(name);
            // values intialised in this block , will remain in block
        }
        System.out.println(a);
        System.out.println(name);
        //System.out.println(c);
        //cannot use outside the block
    }

    static void random(int marks){
        int num = 67;
        System.out.println(num);
        System.out.println(marks);
    }
}
