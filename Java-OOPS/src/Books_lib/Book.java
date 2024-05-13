package Books_lib;

public class Book {
          private int noOfCopies;

          Book(int noOfCopies){
              this.noOfCopies = noOfCopies;
          }

          public int getNoOfCopies(){
              return noOfCopies;
          }

          private String title;

    void settitle(String title){
        this.title = title;
    }

    public String getitle(){
        return title;
    }

    public int increase(int howmuch){
        this.noOfCopies = noOfCopies + howmuch;
        return noOfCopies;
    }

    public int decrease(int howmuch){
        this.noOfCopies = noOfCopies - howmuch;
        return noOfCopies;
    }
}
