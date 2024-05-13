package Books_lib;

public class Book_instances {
    public static void main(String[] args) {
        Book art_of_computer_programming = new Book(1000);
        Book effective_Java = new Book(2343);
        Book clean_Code = new Book(5634);

        System.out.println("no of Copies:"+art_of_computer_programming.getNoOfCopies());

//        art_of_computer_programming.setNoOfCopies(100);
//        effective_Java.setNoOfCopies(50);
//        clean_Code.setNoOfCopies(234);

        art_of_computer_programming.settitle("Java_title_1");
        System.out.println(art_of_computer_programming.getitle());
        effective_Java.settitle("Java_title_2");
        System.out.println(effective_Java.getitle());
        clean_Code.settitle("Java_title_3");
        System.out.println(clean_Code.getitle());


        System.out.println(art_of_computer_programming.increase(100));

        System.out.println(art_of_computer_programming.decrease(150));

    }
}
