package lecture01;

import lecture01.domain.CalculationServiceOld;

public class OopAnotherExample {
    public static void main(String[] args) {
        // 객체 지향적이지 않은 코드 작성
        CalculationServiceOld calculationServiceOld = new CalculationServiceOld();
        int additionResult = calculationServiceOld.calculate('+', 1, 1);
        System.out.println(additionResult);

        int subtractionResult = calculationServiceOld.calculate('-', 1, 1);
        System.out.println(subtractionResult);

        int multiplicationResult = calculationServiceOld.calculate('*', 1, 1);
        System.out.println(multiplicationResult);

        int divisionResult = calculationServiceOld.calculate('/', 8, 1);
        System.out.println(divisionResult);
    }

}

