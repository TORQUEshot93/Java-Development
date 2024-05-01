import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListExample {
    public static void main(String[] args){
           ArrayList<Integer> list = new ArrayList<>();
           Scanner input = new Scanner(System.in);
//           list.add(23);
//           list.add(34);
//           System.out.println(list);

           //input
        for (int i = 0; i < 5; i++) {
            list.add(input.nextInt());
        }
        //output
//        for (int i = 0; i < 5; i++) {
//            System.out.println(list.get(i));
//        }
        //output2
        System.out.println(list);
    }
}
