package main.java.ch03_class.basic.sec07.exam01.service;

import main.java.ch03_class.basic.sec07.exam01.vo.People;
import main.java.ch03_class.basic.sec07.exam01.vo.Student;

import javax.print.attribute.TextSyntax;

// Service : 특정 기능(비즈니스 로직)을 제공하는 클래스
public class ClsService extends Student {
    public void ex1() {
        // 클래스 접근 제한자 확인하기

        Student s1 = new Student();

//        TestVO test = new TextVO();
        //defalut class인 TestVO는 다른패키지여서 import불가

        System.out.println("다른 패키지");
        System.out.println(s1.v1);
        // 다른 패키지에서도 접근 가능한 public만 에러 x
//        System.out.println(s1.v2);
//        System.out.println(s1.v3);
//        System.out.println(s1.v4);

        System.out.println("상속 관계");
        System.out.println(v1);
        System.out.println(v2);
        // 상속 관계 : protected 직접 접근 가능
//        System.out.println(v3);
//        System.out.println(v4);
    }

    public void ex2() {
        // static 필드 확인 예제
        Student s1 = new Student();
        Student s2 = new Student();

        // 간접 접근 방법 setter
        s1.setName("시연");
        s2.setName("채령");

        // 정보 출력
        System.out.println(s1.getName());
        System.out.println(schoolName);
        System.out.println(s2.getName());

        s1.schoolName = "KB유치원";
        System.out.println("변경 후 s1 : " + s1.schoolName);
        System.out.println("변경 후 s2 : " + s2.schoolName);

        Student s3 = new Student();
        System.out.println("s3의 이름 : " + s3.getName());
        System.out.println("s3의 학교 : " + s3.schoolName);

    }

    public void ex3() {
        People people = new People("성범", '남', 20);
        System.out.println("이름 : " + people.getName());
        System.out.println("성별 : " + people.getGender());
        System.out.println("나이 : " + people.getAge());

        people.setGender('여');

        System.out.println(people);
        // print 수행 시 참조변수명만 작성하는 경우
        // 자동으로 toString() 메서드를 호출해서 출력함
    }
}
