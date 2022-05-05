# Modern Java8 Study
[참고 유튜브 링크](https://www.youtube.com/watch?v=mu9XfJofm8U&list=PLRIMoAKN8c6O8_VHOyBOhzBCeN7ShyJ27)

## 프로젝트 목표
- 함수형 프로그래밍(Functional Programming) 내용 학습
- 스트림(Stream) 내용 학습

## 수업 내용 요약

> 1장
- 간단한 예제로 살펴보는 java8 기능을 사용해야 하는 이유\
(lecture01 - WhyJava8Example1)
    - map, collect(joining())
- 간단한 예제로 살펴보는 객체 지향적인 코드 작성 → 함수형 프로그래밍 코드 작성
(lecture01 - OopAnotherExample, OopAnotherExample2, FpExample)
    - OOP에서 불편했던 부분이 FP로 어떻게 개선될 수 있는지 확인
    
> 2장
- java.util.function.Function 내용 및 함수형 프로그래밍 간단한 예제\
(lecture02 - FunctionalInterfaceExample)
 java.util.function.Function 클래스
    - @FunctionalInterface 선언
    - apply() 메서드는 T 타입을 받아서 R 타입을 리턴 → T 타입이 다른 R 타입으로 변경하는 개념
    - 같은 타입을 리턴하는 identity() 정적 메서드도 제공 (필수 조건: 인자로 받은 해당 타입의 객체를 그대로 리턴)
    - 자바8 부터는 인터페이스에 메서드 바디를 가지는 default 메서드를 가질 수 있으며, static 메서드도 가질 수 있음

> 3장
- java.util.function.Consumer 내용 및 함수형 프로그래밍 간단한 예제\
(lecture03 - FunctionalInterfaceExample)
    - @FunctionalInterface 선언
    - accept(T t) 메서드는 T 타입 인자를 받음

> 8장
- Stream으로 (1 ~ ∞) 자연수 값 표현하기\
(lecture08 - StreamExamples1)
- Foreach Loop → Stream API 작성하면서 기능/성능 비교하기\
(lecture08 - StreamExamples2)
- Stream의 Intermediate operation method, Terminal operation method 기본 기능 실습\
(lecture08 - StreamExamples3)
    - filter(), map(), distinct()
    - collect(toList()), collect(toSet()), collect(joining()), findFirst(), count()
- Stream의 기본 기능 실습\
(lecture08 - StreamExamples4)
    - reduce(), filter(), map(), collect()

 
