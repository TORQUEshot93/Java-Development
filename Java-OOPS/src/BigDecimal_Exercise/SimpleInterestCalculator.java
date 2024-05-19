package BigDecimal_Exercise;

import java.math.BigDecimal;

public class SimpleInterestCalculator {
         BigDecimal principal ;
         BigDecimal interest ;

         BigDecimal noOfYears ;


        public SimpleInterestCalculator(String principal , String interest) {
            this.principal = new BigDecimal(principal);
            this.interest = new BigDecimal(interest).divide(new BigDecimal(100));
        }

        public BigDecimal calculateTotalValue(int noOfYears){
            BigDecimal Total_Value = principal.add(principal.multiply(interest).multiply(this.noOfYears));
            return Total_Value;
        }
}
