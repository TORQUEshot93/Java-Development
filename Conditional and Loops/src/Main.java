public class Main{
    public static void main(String[] args){
        int salary = 25000;
        if(salary > 10000){
            salary += 2000;
        }else if(salary < 1000){
            salary += 1000;
        }
        System.out.println(salary);
    }
}