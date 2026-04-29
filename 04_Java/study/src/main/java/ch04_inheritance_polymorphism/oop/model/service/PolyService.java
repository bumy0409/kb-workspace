package main.java.ch04_inheritance_polymorphism.oop.model.service;

import main.java.ch04_inheritance_polymorphism.oop.model.vo.Apple;
import main.java.ch04_inheritance_polymorphism.oop.model.vo.Galaxy;
import main.java.ch04_inheritance_polymorphism.oop.model.vo.Phone;

public class PolyService {
    public void ex1(){
        Phone phone = new Phone();

        Apple apple = new Apple();

        // 다형성 (업캐스팅)
        Phone phone2 = new Apple();
        // 부모타입 참조변수 = 자식객체
        // Apple 객체를 참조하는 변수의 타입에 부모이기 때문에 Apple 객체가 Phone 객체로 변화함

        Phone phone3 = new Galaxy();

        // 자식객체가 부모객체로 변했기때문에 자식만의 고유한 필드, 메소드 사용불가
        phone.setModel("샤오미");
        phone.setColor("white");

        apple.setIosVersion("12.4");
        //--------------------------

        // 객체 배열 : 같은 참조 자료형의 변수를 묶음으로 다루는 것
        Phone[] arr = new Phone[3];
        // 부모타입 참조변수(arr)에 배열 선언 및 할당
        // 각 배열 요소가 Phone 타입 참조 변수

        arr[0] = phone;
        arr[1] = phone2;
        arr[2] = phone3;

        for (int i = 0; i < arr.length; i++) {
            System.out.print(i + "번째 인덱스 : ");
            arr[i].pay();
        }
    }
}
