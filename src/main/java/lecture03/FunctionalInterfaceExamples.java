package lecture03;

import java.util.function.Consumer;

public class FunctionalInterfaceExamples {

    public static void main(String[] args) {
        /*
        java.util.function.Consumer 클래스
        1. @FunctionalInterface 선언
        2. accept(T t) 메서드는 T 타입 인자를 받음
         */

        // 익명 객체 생성
        Consumer<String> print = new Consumer<String>() {
            @Override
            public void accept(String value) {
                System.out.println(value);
            }
        };
        print.accept("Hello");

        // 람다 표현식으로 객체 생성
        Consumer<String> printWithLambda = value -> System.out.println(value);
        printWithLambda.accept("Hello");

        Consumer<String> greetings = value -> System.out.println("Hello " + value);
        greetings.accept("HDH");
    }
}
