package BigDecimal_Exercise;

import java.math.BigDecimal;

public class SimpleIntersetCalculator_Execution {
    public static void main(String[] args) {
        SimpleInterestCalculator calculator = new SimpleInterestCalculator("4500.00","7.5");
        BigDecimal Total_Value = calculator.calculateTotalValue(5);
        System.out.println(Total_Value);
    }
}
