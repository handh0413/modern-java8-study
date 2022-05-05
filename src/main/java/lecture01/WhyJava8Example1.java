package lecture01;

import java.util.Arrays;
import java.util.List;

import static java.util.stream.Collectors.joining;

public class WhyJava8Example1 {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

        StringBuilder stringBuilder = new StringBuilder();

        /*
        [마지막에 : 가 출력되는 문제]
        for (Integer number : numbers) {
            stringBuilder.append(number).append(" : ");
        }
        System.out.println(stringBuilder.toString());
        */

        /*
        [인덱스 관련 코드로 오류에 쉽게 노출된 코드]
        int size = numbers.size();
        for (int i = 0; i < size; i++) {
            stringBuilder.append(numbers.get(i));
            if (i != size - 1) {
                stringBuilder.append(" : ");
            }
        }
        System.out.println(stringBuilder.toString());
        */

        /*
        [인덱스 관련 코드로 오류에 쉽게 노출된 코드]
        String separator = " : - ";
        for (Integer number : numbers) {
            stringBuilder.append(number).append(separator);
        }
        int stringLength = stringBuilder.length();
        if (stringLength > 0) {
            stringBuilder.delete(stringLength - separator.length(), stringLength);
        }
        System.out.println(stringBuilder.toString());
        */

        // 자바8의 기능을 이용하면 간결하게 코드 작성이 가능하다.
        String result = numbers.stream()
                .map(String::valueOf)
                .collect(joining(" : "));
        System.out.println(result);

        /*
        map : 하나의 타입을 다른 타입으로 매핑하는 역할 수행
        ex) Integer → String
        collect(joining(" : ")) : delimiter를 이용하여 String을 합치는 역할 수행
         */
    }
}
