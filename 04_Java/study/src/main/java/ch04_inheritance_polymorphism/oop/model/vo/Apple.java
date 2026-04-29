package main.java.ch04_inheritance_polymorphism.oop.model.vo;

public class Apple extends Phone {
    // Apple 클래스에 Phone 클래스의 내용을 확장한다.
    // == Apple 클래스에 Phone 클래스의 내용(필드, 메소드)을 추가하여 확장

    private String iosVersion;

    public Apple() {

    }



    public Apple(String model, String color, String iosVersion) {
        // super == Phone <-> sub : 하위
        // 반드시 최상단
        super(model, color);
        this.iosVersion = iosVersion;

        System.out.println("Apple 생성자 실행");
    }

    public String getIosVersion() {
        return iosVersion;
    }

    public void setIosVersion(String iosVersion) {
        this.iosVersion = iosVersion;
    }

    @Override
    public void pay() {
        System.out.println("Apple pay로 결제하기");
    }

    @Override
    public String toString() {
        return super.toString() + ", " +
                "iosVersion=" + iosVersion;
    }
}
