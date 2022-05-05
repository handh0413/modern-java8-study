package lecture01.domain;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class CalculationTest {
    @Test
    void testAddition() {
        Calculation calculation = new Addition();
        int actual = calculation.calculate(1, 1);
        assertThat(actual).isEqualTo(2);
    }

    @Test
    void testLambdaAddition() {
        Calculation calculation = (i1, i2) -> i1 + i2;
        int actual = calculation.calculate(1, 1);
        assertThat(actual).isEqualTo(2);
    }

    @Test
    void testSubtraction() {
        Calculation calculation = new Subtraction();
        int actual = calculation.calculate(1, 1);
        assertThat(actual).isEqualTo(0);
    }

    @Test
    void testLambdaSubtraction() {
        Calculation calculation = (i1, i2) -> i1 - i2;
        int actual = calculation.calculate(1, 1);
        assertThat(actual).isEqualTo(0);
    }

    @Test
    void testMultiplication() {
        Calculation calculation = new Multiplication();
        int actual = calculation.calculate(1, 1);
        assertThat(actual).isEqualTo(1);
    }

    @Test
    void testLambdaMultiplication() {
        Calculation calculation = (i1, i2) -> i1 * i2;
        int actual = calculation.calculate(1, 1);
        assertThat(actual).isEqualTo(1);
    }

    @Test
    void testDivision() {
        Calculation calculation = new Division();
        int actual = calculation.calculate(8, 4);
        assertThat(actual).isEqualTo(2);
    }

    @Test
    void testLambdaDivision() {
        Calculation calculation = (i1, i2) -> i1 / i2;
        int actual = calculation.calculate(8, 4);
        assertThat(actual).isEqualTo(2);
    }

}