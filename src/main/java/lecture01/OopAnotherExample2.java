package lecture01;

import lecture01.domain.*;

public class OopAnotherExample2 {
    public static void main(String[] args) {
        // 객체 지향적인 코드 작성
        CalculationService calculationService = new CalculationService(new Addition());
        int additionResult = calculationService.calculate(1, 1);
        System.out.println(additionResult);

        calculationService = new CalculationService(new Subtraction());
        int subtractionResult = calculationService.calculate(1, 1);
        System.out.println(subtractionResult);

        calculationService = new CalculationService(new Multiplication());
        int multiplicationResult = calculationService.calculate(1, 1);
        System.out.println(multiplicationResult);

        calculationService = new CalculationService(new Division());
        int divisionResult = calculationService.calculate(8, 2);
        System.out.println(divisionResult);
    }
}


