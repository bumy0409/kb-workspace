package main.java.ch09_collection_generic.collection.list.ex;

import java.util.ArrayList;
import java.util.List;

public class ListEx {
    // 컬렉션 특징
    // 1) 크기 제한 X
    // 2) 추가, 수정, 삭제 등의 코드가 구현되어 있다.
    // 3) 객체만 저장 가능

    // List : 자료를 순차적으로 나열한 자료구조 (배열과 비슷)
    // - 특징 1 : 인덱스를 이용해서 순서를 구분
    // - 특징 2 : 순서가 구분되기 때문에 중복 데이터 저장 가능
    public void ex1() {
        List list = new ArrayList(3);

        // 기본 자료형이 저장되는 이유
        // -> Wrapper class : 기본 자료형 -> 객체로 포장하는 클래스

        //1. boolean add(E e) : 마지막 요소로 추가
        list.add("글자");
        list.add(123);
        list.add(3.14);

        // 컬렉션에 저장되는 객체의 타입제한 x
        System.out.println(list);

        list.add("리스트의 크기(3) 초과");
        // -> list의 크기를 초과해도 자동으로 크기가 늘어나기 때문에 에러발생 x

        System.out.println("------------------------------------");
        
        // 진짜로 자동 포장(Auto Boxing)이 되었는지 확인
        System.out.println(list.get(2) instanceof Object);

        for (int i = 0; i < list.size(); i++) {
            if (list.get(i) instanceof String) {
                String str = (String) list.get(i);
                System.out.println(str.charAt(0));
            }

            if (list.get(i) instanceof Integer) {

                // Auto Unboxing
                int num = (int) list.get(i);
                // int = Integer
                //       Integer -> int
                System.out.println(100 + num);
            }

            if (list.get(i) instanceof Double) {
                Double d = (Double) list.get(i);
                System.out.println(Double.BYTES);
            }
        }
    }

    public void  ex2() {
        // 컬렉션의 장점 중 "여러 타입저장 가능" 때문에
        // instanceOf로 타입 검사를 해야하는 코드가 추가되어 코드의 길이가 늘어나는 문제점 발생
        List<String> list = new ArrayList<>();
        list.add("딸기빙수");
        list.add("치즈케이크");
//        list.add(500);

    }
}
