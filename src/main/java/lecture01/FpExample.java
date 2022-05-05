package lecture01;

import lecture01.domain.FpCalculationService;

public class FpExample {
    public static void main(String[] args) {
        // 함수형 프로그래밍을 이용한 코드 작성
        FpCalculationService fpCalculationService = new FpCalculationService();
        System.out.println("addition: " + fpCalculationService.calculate((num1, num2) -> num1 + num2, 11, 7));
        System.out.println("subtraction: " + fpCalculationService.calculate((num1, num2) -> num1 - num2, 11, 7));
        System.out.println("multiplication: " + fpCalculationService.calculate((num1, num2) -> num1 * num2, 11, 7));
        System.out.println("division: " + fpCalculationService.calculate((num1, num2) -> num1 / num2, 14, 7));
    }
}
