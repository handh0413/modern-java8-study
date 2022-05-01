package lecture08;

import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.stream.Stream;

import static java.util.stream.Collectors.*;

public class StreamExamples3 {
    public static void main(String[] args) {
        /*
        Stream에는 Intermediate operation method, Terminal operation method 로 나눌 수 있다.
        Intermediate operation method: Stream 리턴
        Terminal operation method: Collection 또는 Optional 등 다른 타입 리턴
         */
        final List<String> list = Stream.of(1, 3, 3, 5, 5)
                .filter(i -> i > 2)
                .map(i -> i * 2)
                .map(i -> "#" + i)
                .collect(toList()); // 마지막은 Terminal operation method
        System.out.println("collect(toList()): " + list);

        final Set<String> set = Stream.of(1, 3, 3, 5, 5)
                .filter(i -> i > 2)
                .map(i -> i * 2)
                .map(i -> "#" + i)
                .collect(toSet()); // 마지막은 Terminal operation method
        System.out.println("collect(toSet()): " + set);

        final String joining = Stream.of(1, 3, 3, 5, 5)
                .filter(i -> i > 2)
                .map(i -> i * 2)
                .map(i -> "#" + i)
                .collect(joining(", ", "[", "]"));// 마지막은 Terminal operation method
        System.out.println("collect(joining(\", \")): " + joining); // [#6, #6, #10, #10]

        final String joiningWithoutDuplication = Stream.of(1, 3, 3, 5, 5)
                .filter(i -> i > 2)
                .map(i -> i * 2)
                .map(i -> "#" + i)
                .distinct()
                .collect(joining(", ", "[", "]"));// 마지막은 Terminal operation method
        System.out.println("distinct.collect(joining(\", \")): " + joiningWithoutDuplication); // [#6, #10]

        final List<String> listWithoutDuplication = Stream.of(1, 3, 3, 5, 5)
                .filter(i -> i > 2)
                .map(i -> i * 2)
                .map(i -> "#" + i)
                .distinct()
                .collect(toList());// 마지막은 Terminal operation method
        System.out.println("distinct.collect(toList()): " + listWithoutDuplication); // [#6, #10]

        System.out.println("findFirst: " +
                Stream.of(1, 3, 3, 5, 5)
                .filter(i -> i.equals(new Integer(3)))
                .findFirst()
                .get());

        System.out.println("count: " +
                Stream.of(1, 2, 3, 4, 5)
                .filter(i -> i > 3)
                .count());

        final List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        // External Iterator
        for (Integer i : numbers) {
            System.out.print("i = " + i + ", ");
        }
        System.out.println();

        // Internal Iterator
        numbers.stream().forEach(i -> System.out.print("i = " + i + ", "));
        System.out.println();
    }
}
