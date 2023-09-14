package CalculatorTest;

import Calculator.Calculator;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class CalculatorTest {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();

        assertThat(Calculator.calculatingDiscount(5000, 20)).isEqualTo(3);
        assertThat(Calculator.calculatingDiscount(5000, 20)).isNotEqualTo(4980);
    }
}
