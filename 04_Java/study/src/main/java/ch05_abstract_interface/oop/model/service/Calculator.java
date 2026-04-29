package main.java.ch05_abstract_interface.oop.model.service;

public interface Calculator {
    // 인터페이스 : 클래스가 반드시 지켜야 하는 규칙을 정의하는 설계도
    // 추상클래스 : 공통된 기능을 제공하면서 필요 시 추상 메서드로 확장을 강제하는 클래스

    double PI = 3.14;
    int MAX_NUM = 2_147_000_000;
    int MIN_NUM = -2_147_000_000;
    int ZERO = 0;

    public abstract int plus(int a, int b);
    public abstract int minus(int a, int b);
    public abstract int multiple(int a, int b);
    public abstract int divide(int a, int b);

}
