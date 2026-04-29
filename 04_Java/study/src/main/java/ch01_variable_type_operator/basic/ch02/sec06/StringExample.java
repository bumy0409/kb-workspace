package main.java.ch01_variable_type_operator.basic.ch02.sec06;

public class StringExample {
    public static void main(String[] args) {
        // escape 문자 : 일반 문자가 아닌 특수 문자 표현
        // 문자열 내에서 탭, 백슬레쉬, 작은 따옴표 등을
        // 코드로 사용하기 위한 방식
        String name = "홍길동";
        String job = "프로그래머";
        System.out.println(name);
        System.out.println(job);

        System.out.println("나는 \"자바\"를 배웁니다.");
        System.out.println("나는\t자바를\t배웁니다");

    }
}
