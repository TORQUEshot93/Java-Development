package BiNumbers_exercise;

public class BiNumber {
          private int num1;
          private int num2;

          public BiNumber(int i, int i1) {
              this.num1 = i;
              this.num2 = i1;
          }

           public int add(){
              int sum = this.num1 + this.num2;
              return sum;
          }

          public int multiply(){
              int multiplication_ans = this.num1 * this.num2;
              return multiplication_ans;
          }

          public void doubles(){
              this.num1 = this.num1 * 2;
              this.num2 = this.num2 * 2;
         }

         public int getNumber1(){
              return this.num1;
         }

         public int getNumber2(){
              return this.num2;
         }
}
