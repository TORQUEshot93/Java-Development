package Books_lib;

public class Book {
          private int noOfCopies;

          private String title;

    public void setNoOfCopies(int noOfCopies){
              this.noOfCopies = noOfCopies;
              System.out.println(noOfCopies);
    }

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
