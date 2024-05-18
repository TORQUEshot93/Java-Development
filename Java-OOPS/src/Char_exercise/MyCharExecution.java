package Char_exercise;

public class MyCharExecution {
    public static void main(String[] args) {
        MyChar myChar = new MyChar('c');
        System.out.println(myChar.isVowel());
        System.out.println(myChar.isNumber());
        System.out.println(myChar.isConsonant());
        MyChar.printLowerCaseAlphabets();
        MyChar.printUpperCaseAlphabets();
    }
}
