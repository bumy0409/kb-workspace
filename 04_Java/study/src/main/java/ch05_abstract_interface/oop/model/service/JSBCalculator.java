package main.java.ch05_abstract_interface.oop.model.service;

public class JSBCalculator implements Calculator {
    @Override
    public int plus(int a, int b) {
        return a + b;
    }

    @Override
    public int minus(int a, int b) {
        return a -  b;
    }

    @Override
    public int multiple(int a, int b) {
        return a * b;
    }

    @Override
    public int divide(int a, int b) {
        return a / b;
    }
}
