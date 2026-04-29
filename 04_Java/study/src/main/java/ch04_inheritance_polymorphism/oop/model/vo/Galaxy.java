package main.java.ch04_inheritance_polymorphism.oop.model.vo;

public class Galaxy extends Phone {
    private boolean foldable;

    public Galaxy() {
        // Galaxy 객체 생성 시
        // 내부에 상속 받은 Phone 객체를 생성하기 위한
        // Phone 생성자 호출 코드가 필요!!
        super();
        // super 생성자 미작성 시 컴파일러가 자동으로 추가
        System.out.println("Galaxy constructor");
    }

    public Galaxy(String model, String color, boolean foldable) {
        super(model, color);
        this.foldable = foldable;
    }

    public boolean isFoldable() {
        return foldable;
    }

    public void setFoldable(boolean foldable) {
        this.foldable = foldable;
    }

    // 어노테이션 : 컴파일러에게 알려주기 위한 코드
    //오버라이딩
    @Override
    public void pay() {
        System.out.println("부모로부터 물려받은 메서드 재정의");
    }

}
