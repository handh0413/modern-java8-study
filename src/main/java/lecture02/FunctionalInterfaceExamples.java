package lecture02;

import java.util.function.Function;

public class FunctionalInterfaceExamples {

    public static void main(String[] args) {
        /*
        Functional Interface : interface이며 그 안에 abstract 메서드가 하나만 존재한다.
        함수형 인터페이스에 대한 익명 객체를 생성하지 않고도 람다 표현식으로 객체를 대체하는 것이 가능하다.

        java.util.function.Function 클래스
        1. @FunctionalInterface 선언
        2. apply() 메서드는 T 타입을 받아서 R 타입을 리턴 → T 타입이 다른 R 타입으로 변경하는 개념
        3. 같은 타입을 리턴하는 identity() 정적 메서드도 제공 (필수 조건: 인자로 받은 해당 타입의 객체를 그대로 리턴)
        4. 자바8 부터는 인터페이스에 메서드 바디를 가지는 default 메서드를 가질 수 있으며, static 메서드도 가질 수 있음
         */

        // 익명 객체 생성
        Function<String, Integer> toInt = new Function<String, Integer>() {
            @Override
            public Integer apply(String value) {
                return Integer.parseInt(value);
            }
        };

        Integer number1 = toInt.apply("100");
        System.out.println("number1: " + number1);

        // 람다 표현식으로 객체 생성
        Function<String, Integer> toIntWithLambda = value -> Integer.parseInt(value);
        Integer number2 = toIntWithLambda.apply("200");
        System.out.println("number2: " + number2);

        // identity
        // Function<Integer, Integer> identity = Function.identity();
        Function<Integer, Integer> identity = t -> t;
        System.out.println(identity.apply(999));
    }
}
