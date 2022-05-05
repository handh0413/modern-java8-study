package lecture01.domain;

public class CalculationServiceOld {
    /*
    [문제점]
    calculation 인자에 따라서 기능이 달라진다.
    허용되지 않은 인자를 전달 받으면 오류가 발생한다.
     */
    public int calculate(char calculation, int num1, int num2) {
        if (calculation == '+') {
            return num1 + num2;
        } else if (calculation == '-') {
            return num1 - num2;
        } else if (calculation == '*') {
            return num1 * num2;
        } else if (calculation == '/') {
            return num1 / num2;
        } else {
            throw new IllegalArgumentException("Unknown calculation: " + calculation);
        }
    }
}
