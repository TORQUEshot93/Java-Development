package Linear_Search_Algo;

import java.util.Scanner;

//Q.Search in string using linear search
public class SearchInString {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String name = "Omkar";
        char target = 'k';
        boolean ans = SearchInString(name,target);
        System.out.println("If it matchs print true if not then false:");
        System.out.println(ans);
    }

    static Boolean SearchInString(String str ,char target){
        if(str.length()==0){
            return false;
        }
        for(char ch:str.toCharArray()){
            if(ch == target){
                return true;
            }
        }
        return false;
    }
//    static Boolean Linear_Search_Algo.SearchInString(String str ,char ch){
//        if(str.length()==0){
//            return false;
//        }
//        for (int i = 0; i < str.length(); i++) {
//            if( ch == str.charAt(i)){
//                return true;
//            }
//        }
//        return false;
//    }
}
