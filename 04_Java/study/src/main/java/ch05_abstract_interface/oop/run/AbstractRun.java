package main.java.ch05_abstract_interface.oop.run;

import main.java.ch05_abstract_interface.oop.model.service.AbstractService;
import main.java.ch05_abstract_interface.oop.model.service.Calculator;
import main.java.ch05_abstract_interface.oop.model.service.JSBCalculator;

public class AbstractRun {
    public static void main(String[] args) {

        AbstractService service = new AbstractService();

//        service.ex1();

        Calculator cal = new JSBCalculator();

        System.out.println("합 : " + cal.plus(20, 15));
        System.out.println("차 : " + cal.minus(20, 15));
        System.out.println("곱 : " + cal.multiple(20, 15));
        System.out.println("몫 : " + cal.divide(20, 15));

        // 인터페이스 : 인터페이스를 부모 참조변수로 사용하면 다형성이 적용돼 상속받은 모든 클래스를 자식객체로 참조가능
    }
}
