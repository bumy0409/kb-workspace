package main.java.ch09_collection_generic.collection.set.ex;

import java.util.*;

public class SetEx {
    // 컬렉션 특징 : 객체만 저장, 크기 제한 x, 다양한 기능 제공

    // Set(집합)
    // - 중복 데이터 저장 불가(같은 객체를 덮어씌움)
    // - 순서를 유지하지 않음(index 없음)
    // -> get() 메서드 없음

    public void ex1() {
        // 기본적인 Set 사용법

        // HashSet : hashcode()를 이용해서 중복 비교
        // 사용 조건1 : 저장되는 객체에 hashcode() 오버라이딩 필수
        // 사용 조건1 : 저장되는 객체에 equals() 오버라이딩 필수

        // String, Integer 등 Java 제공 객체는 기본적으로 hashcode(), equals()등이 오버라이딩 되어있음.
        Set<String> set = new HashSet<>();

        // 1. boolean set.add(E e) : 추가
        set.add("딸기");
        set.add("포도");
        set.add("오렌지");
        set.add("체리");

        set.add("망고");
        set.add("망고");
        set.add("망고");

        System.out.println(set);

        // 2. int set.size() : 저장된 객체의 수 반환
        System.out.println(set.size());

        // 3. boolean remove(E e)
        // - e와 똑같은 요소가 있으면 제거하고 true 반환 없으면 false 반환

        if (set.remove("딸기")) {
            System.out.println("딸기가 제거되었습니다.");
        } else {
            System.out.println("딸기가 없습니다.");
        }

        System.out.println(set);

        // 4. boolean set.contains(E e)
        //    (반환형)
        // - set에 저장된 객체 중 e와 똑같은 객체가 있으면 true,
        //   없으면 false

        System.out.println("망고" + (set.contains("망고") ? "있음" : "없음"));

        // ---------------------------------------------------------
        Iterator<String> iterator = set.iterator();
        while (iterator.hasNext()) {
            if (iterator.next().equals("망고")) {
                iterator.remove();
            }
        }
        System.out.println(set);
        // ------------------------------------------------------------

        // 5. void set.clear() : set에 저장된 객체 모두 지움
        set.clear();
        System.out.println(set.size());

        // 6. boolean set.isEmpty()
        System.out.println("set이 " + (set.isEmpty() ? "비어있음" : "비어있지 않음"));


    }

    public void ex2() {
        Set<String> set = new HashSet<>();
        set.add("딸기라테");
        set.add("블루베리 스무디");
        set.add("흑당퐁라테");
        set.add("아바라");

        // 1. Iterator
        // - 컬렉션에서 제공하는 컬렉션 객체 반복 접근자

        // set의 내용을 순차 접근할 수 있는 형태로 변경해서 반환
        Iterator<String> it = set.iterator();
        while (it.hasNext()) {
            System.out.println(it.next());
        }

        // =============================================
        System.out.println("---------------------------");

        // 2. 향상된 for문
        for (String s : set) {
            System.out.println(s);
        }
    }

    public void lotto() {
        // 로또 번호 (1~45 난수, 6개, 중복X, 오름차순)
        Random random = new Random();

//        Set<Integer> lotto = new LinkedHashSet<>(); // 순서 유지되는 HashSet

        Set<Integer> lotto = new TreeSet<>();

        System.out.println(lotto.size()); // 0

        // random.nextInt(n) : 0 <= x < n
        while (lotto.size() < 6) {
            lotto.add(random.nextInt(45) + 1);
            //int값이 자동으로 Integer로 포장(오토박싱)되어 lotto에 추가

            System.out.println(lotto + " ");
        }

        System.out.println(lotto);
    }

}
