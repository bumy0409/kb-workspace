package main.java.ch03_class.basic.sec06.exam01;

public class CarExample {
    public static void main(String[] args) {
        Car car = new Car();
        System.out.println("모델명 : " + car.model);
        System.out.println("시동여부 : " + car.start);
        System.out.println("현재속도 : " + car.speed);

        System.out.println("바퀴 수 : " + Car.wheel);
        // static 필드/메서드는 클래스명.필드명

        System.out.println("-----------------------");

        car.drive();
        System.out.println(car.intro());
    }
}
