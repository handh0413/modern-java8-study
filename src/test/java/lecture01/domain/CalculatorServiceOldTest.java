package lecture01.domain;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class CalculatorServiceOldTest {

    @Test
    void testCalculateAddition() {
        CalculationServiceOld calculationServiceOld = new CalculationServiceOld();
        int actual = calculationServiceOld.calculate('+', 1, 1);
        assertThat(actual).isEqualTo(2);
    }

    @Test
    void testCalculateSubtraction() {
        CalculationServiceOld calculationServiceOld = new CalculationServiceOld();
        int actual = calculationServiceOld.calculate('-', 1, 1);
        assertThat(actual).isEqualTo(0);
    }

    @Test
    void testCalculateMultiplication() {
        CalculationServiceOld calculationServiceOld = new CalculationServiceOld();
        int actual = calculationServiceOld.calculate('*', 1, 1);
        assertThat(actual).isEqualTo(1);
    }

    @Test
    void testCalculateDivision() {
        CalculationServiceOld calculationServiceOld = new CalculationServiceOld();
        int actual = calculationServiceOld.calculate('/', 8, 4);
        assertThat(actual).isEqualTo(2);
    }
}