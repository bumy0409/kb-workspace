package main.java.ch10_collection.basic.sec03.exam02;

import java.util.Objects;

public class Member {
    public String name;
    public int age;
    public Member() {
    }
    public Member(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age);  // name+age로 해시코드 생성
    }

    @Override
    public boolean equals(Object obj) {
        Member p = (Member) obj;
        return this.name.equals(p.name) && this.age == p.age;
    }
}
