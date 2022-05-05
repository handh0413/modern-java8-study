package lecture04;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class FunctionalInterfaceExamples {

    public static void main(String[] args) {
        /*
        입력 값을 받아서 boolean을 반환하는 함수 Predicate
        특히 많이 쓰이는 Function 중 하나라서 Function을 쓰는 대신 따로 만들어진 함수

        java.util.function.Predicate 클래스
        1. @FunctionalInterface 선언
        2. test(T t) 메서드는 T 타입 인자를 받음
        3. 항상 boolean 타입 결과를 리턴
        4. 주어진 조건이 충족되는지 여부를 판단
         */

        Predicate<Integer> isPositive = value -> value > 0;
        System.out.println(isPositive.test(10));
        System.out.println(isPositive.test(1));
        System.out.println(isPositive.test(0));
        System.out.println(isPositive.test(-1));
        System.out.println(isPositive.test(-10));

        List<Integer> numbers = Arrays.asList(-5, -4, -3, -2, -1, 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

        System.out.println();
        // 양의 정수 찾기
        ArrayList<Integer> positiveNumbers = new ArrayList<>();
        for (Integer num : numbers) {
            if (isPositive.test(num)) {
                positiveNumbers.add(num);
            }
        }
        System.out.println("positive integers: " + positiveNumbers);

        Predicate<Integer> lessThan3 = i -> i < 3;
        List<Integer> numbersLessThan3 = new ArrayList<>();
        for (Integer num : numbers) {
            if (lessThan3.test(num)) {
                numbersLessThan3.add(num);
            }
        }
        System.out.println("less then 3: " + numbersLessThan3);

        System.out.println();
        System.out.println("positive integers: " + filter(numbers, isPositive));
        System.out.println("less then 3: " + filter(numbers, lessThan3));
    }

    private static <T> List<T> filter(List<T> list, Predicate<T> filter) {
        List<T> result = new ArrayList<>();
        for (T t : list) {
            if (filter.test(t)) {
                result.add(t);
            }
        }
        return result;
    }
}
