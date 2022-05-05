package lecture01.domain;

public class CalculationService {
    private Calculation calculation;

    public CalculationService(Calculation calculation) {
        this.calculation = calculation;
    }

    /*
    전달 받은 Calculation 객체에 따라서 기능이 달라진다.
     */
    public int calculate(int num1, int num2) {
        return calculation.calculate(num1, num2);
    }
}