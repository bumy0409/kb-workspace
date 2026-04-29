package main.java.ch03_class.basic.sec07.exam01.vo;

public class People {
    // 클래스란? 객체를 만들기 위한 설계도
    // -> 객체의 특성(속성, 기능)을 정의한 것

    // 캡슐화(Encapsulation)
    // - 데이터와 기능을 하나로 묶어서 관리하는 기법
    // - 데이터의 직접적인 접근을 제한하는 것이 원칙
    // -> 직접 접근을 못하기 때문에 클래스 내부에 간접 접근 방법을 제공하는 기능을 작성해둠

    // ** 데이터 직접 접근 제한 **
    // public(공공의) -> private(사적인, 개인적인)

    // 속성 == data == 값
    // 값을 저장하기 위한 변수 선언
    private String name;
    private char gender;
    private int age;
//    private double bitCoin; // -> 공통점이 아니므로 제거

    // 기능 == method == 행동

    // 생성자
    public People() {

    }

    // 기본 생성자
    public People(String name, char gender, int age) {
        this.name = name;
        this.gender = gender;
        this.age = age;
    }

    public String getName() {
        return name; //==this.name
    }

    public char getGender() {
        return gender;
    }

    public int getAge() {
        return age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setGender(char gender) {
        this.gender = gender;
    }

    public void setAge(int age) {
        this.age = age;
    }


    // 매개변수 3개 생성자
    public void tax() {
        System.out.println("세금을 납부한다.");
    }

    // *** 오버라이딩 성립 조건 ***
    // 1. 메소드 이름 동일
    // 2. 반환형 동일
    // 3. 매개변수 동일
    // 4. 접근제한자 같거나 더 넓은 범위
    //    ex) (부) protected -> (자) protected 또는 public
    // 5. 예외처리 범위는 같거나 더 좁게

    //Object.toString() 메서드 오버라이딩
    @Override
    public String toString() {
        return "People{" +
                "name='" + name + '\'' +
                ", gender=" + gender +
                ", age=" + age +
                '}';
    }
    //People 클래스의 toString 오버라이딩 후
    //오버라이딩 된 자식의 toString 호출
}
