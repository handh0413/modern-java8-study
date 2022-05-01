package lecture08;

import java.util.stream.IntStream;

public class StreamExamples1 {
    public static void main(String[] args) {
        // 0 ~ 9 까지 출력
        IntStream.range(0, 10).forEach(i -> System.out.print(i + " "));
        System.out.println();
        // 1 ~ 10 까지 출력
        IntStream.rangeClosed(1, 10).forEach(i -> System.out.print(i + " "));

        // 1 ~ int 범위 숫자 출력 (메모리 허용 범위 내)
        // iterator 에서 시드 값을 1씩 증가, forEach 에서 값 출력
//        IntStream.iterate(1, i -> i + 1)
//                .forEach(i -> System.out.print(i + " "));

        // 1 ~ 무한 범위 숫자 출력 (메모리 허용 범위 내)
        // iterator 에서 시드 값을 1씩 증가, forEach 에서 값 출력
//        Stream.iterate(BigInteger.ZERO, i -> i.add(BigInteger.ONE))
//                .forEach(i -> System.out.println(i + " "));
    }
}
