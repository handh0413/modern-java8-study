package lecture01.domain;

public class FpCalculationService {
    /*
    함수형 프로그래밍(Functional Programming)을 이용하면
    행동(기능)을 메서드의 인자로 전달할 수 있다는 장점이 있다.

    이처럼 변할 수 있는 부분을 인자로 받을 수 있으므로,
    불필요한 보일러플레이트 코드를 생성하지 않아도 된다.
     */
    public int calculate(Calculation calculation, int num1, int num2) {
        if (num1 > 10 && num2 < num1) {
            return calculation.calculate(num1, num2);
        } else {
            throw new IllegalArgumentException("Invalid input num1 : " + num1 + ", num2 : " + num2);
        }
    }
}
