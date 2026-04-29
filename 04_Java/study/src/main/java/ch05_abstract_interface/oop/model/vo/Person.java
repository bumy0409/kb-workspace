package main.java.ch05_abstract_interface.oop.model.vo;

import lombok.*;

@Getter @Setter
@AllArgsConstructor
@NoArgsConstructor
public class Person extends Animal {
    private String name;

    @Override
    public void eat() {
        System.out.println("숟가락, 젓가락을 이용하여 먹는다");
    }

    @Override
    public void breath() {
        System.out.println("코나 입으로 숨쉰다.");
    }
}
