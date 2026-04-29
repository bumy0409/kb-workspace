package main.java.ch05_abstract_interface.oop.model.vo;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter @Setter
@AllArgsConstructor
@NoArgsConstructor
public abstract class Animal {
    // 추상 클래스
    // - 미완성 부분(추상 메서드)이 포함된 클래스
    // - 미완성 클래스이므로 단독 객체 생성 불가능!!

    private String type;
    private String eatType;

    public abstract void eat();

    public abstract void breath();
}
