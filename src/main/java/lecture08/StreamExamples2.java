package lecture08;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Stream;

public class StreamExamples2 {
    public static void main(String[] args) {
        // Stream interface는 of 라는 static 멤버 가지고 있으며, 자바8 부터 interface도 static 멤버를 가질 수 있다.
        Stream.of(1, 2, 3, 4, 5)
                .forEach(i -> System.out.print(i + " "));
        System.out.println();

        final List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        Integer result = null;
        for (final Integer number : numbers) {
            // 3보다 크고 9보다 작은
            if (number > 3 && number < 9) {
                // 2배로 증가
                final Integer newNumber = number * 2;
                // 10을 초과하는 첫 번째 수
                if (newNumber > 10) {
                    result = newNumber;
                    break;
                }
            }
        }
        System.out.println("Imperative Result: " + result);

        // Stream으로 간편하게 구하기
        // Stream 게으르다 → findFirst() 확인하고서야 필요한 값을 빠르게 찾아낸다!
        System.out.println("Functional Result: " + numbers.stream()
                .filter(number -> number > 3)
                .filter(number -> number < 9)
                .map(number -> 2 * number)
                .filter(number -> number > 10)
                .findFirst()
                .orElse(-1));

        // 필요한 값을 비효율적으로 찾아낸다!
//        final AtomicInteger count = new AtomicInteger(1);
//        final List<Integer> greaterThan3 = filter(numbers, i -> {
//            System.out.println(count.getAndAdd(1) + ": i > 3");
//            return i > 3;
//        });
//        final List<Integer> lessThan9 = filter(greaterThan3, i -> {
//            System.out.println(count.getAndAdd(1) + ": i < 9");
//            return i < 9;
//        });
//        final List<Integer> doubled = map(lessThan9, i -> {
//            System.out.println(count.getAndAdd(1) + ": i * 2");
//            return i * 2;
//        });
//        final List<Integer> greaterThan10 = filter(doubled, i -> {
//            System.out.println(count.getAndAdd(1) + ": i > 10");
//            return i > 10;
//        });

        // 필요한 값을 비효율적으로 찾아낸다!
        final List<Integer> greaterThan3 = filter(numbers, i -> i > 3);
        final List<Integer> lessThan9 = filter(greaterThan3, i -> i < 9);
        final List<Integer> doubled = map(lessThan9, i -> i * 2);
        final List<Integer> greaterThan10 = filter(doubled, i -> i > 10);
        System.out.println("My own method result: " + greaterThan10);
        System.out.println("My own method result.get(0): " + greaterThan10.get(0));

        System.out.println("=========================");

        // 필요한 값을 비효율적으로 찾아낸다!
        final List<Integer> myOwnMethodResult = filter(map(filter(filter(numbers, i -> i > 3), i -> i < 9), i -> i * 2), i -> i > 10);
        System.out.println("My own method result: " + myOwnMethodResult);
        System.out.println("My own method result.get(0): " + myOwnMethodResult.get(0));

    }

    private static <T> List<T> filter(List<T> list, Predicate<T> predicate) {
        final List<T> result = new ArrayList<>();
        for (final T t : list) {
            if (predicate.test(t)) {
                result.add(t);
            }
        }
        return result;
    }

    private static <T, R> List<R> map(List<T> list, Function<T, R> mapper) {
        final List<R> result = new ArrayList<>();
        for (final T t : list) {
            result.add(mapper.apply(t));
        }
        return result;
    }
}
