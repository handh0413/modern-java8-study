package lecture01.domain;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class CalculationServiceTest {

    @Test
    void testCalculateAddition() {
        CalculationService CalculationService = new CalculationService(new Addition());
        int actual = CalculationService.calculate(1, 1);
        assertThat(actual).isEqualTo(2);
    }

    @Test
    void testCalculateSubtraction() {
        CalculationService CalculationService = new CalculationService(new Subtraction());
        int actual = CalculationService.calculate(1, 1);
        assertThat(actual).isEqualTo(0);
    }

    @Test
    void testCalculateMultiplication() {
        CalculationService calculatorServiceOld = new CalculationService(new Multiplication());
        int actual = calculatorServiceOld.calculate(1, 1);
        assertThat(actual).isEqualTo(1);
    }

    @Test
    void testCalculateDivision() {
        CalculationService calculatorServiceOld = new CalculationService(new Division());
        int actual = calculatorServiceOld.calculate(8, 4);
        assertThat(actual).isEqualTo(2);
    }
}