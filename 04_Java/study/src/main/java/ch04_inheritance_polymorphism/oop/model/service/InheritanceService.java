package main.java.ch04_inheritance_polymorphism.oop.model.service;

import main.java.ch04_inheritance_polymorphism.oop.model.vo.Apple;
import main.java.ch04_inheritance_polymorphism.oop.model.vo.Galaxy;
import main.java.ch04_inheritance_polymorphism.oop.model.vo.Phone;

public class InheritanceService {
    public void ex1() {
        // 상속 확인
        // Phone을 상속 받은 Apple이 Phone의 필드, 메서드 사용 가능한가?

        Phone phone = new Phone();
        System.out.println(phone.getColor());
        System.out.println("----------------");

        Apple apple = new Apple();
        apple.setIosVersion("32.1버전");

        apple.setColor("핑크");

        System.out.println(apple.getIosVersion());
        System.out.println(apple.getColor());
        System.out.println("----------------");
    }

    public void ex2() {
        Galaxy galaxy = new Galaxy();

        galaxy.pay();

        System.out.println("----------------");

        Phone phone = new Phone("아이폰23", "gold");
        Apple apple = new Apple("아이폰Xs", "gray", "3버전");

        System.out.println(phone.toString());
        System.out.println(apple.toString());

    }

    public void ex3() {
        Galaxy galaxy = new Galaxy();
    }
}
