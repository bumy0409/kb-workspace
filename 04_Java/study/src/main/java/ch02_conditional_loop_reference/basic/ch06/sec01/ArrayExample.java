package main.java.ch02_conditional_loop_reference.basic.ch06.sec01;

import java.util.Arrays;

public class ArrayExample {
    public static void main(String[] args) {
        /* 배열(Array)
         * - 같은 자료형의 변수를 하나의 묶음으로 다루는 것 (자료구조)
         *
         * - 묶여진 변수들은 하나의 이름(배열명)으로 불려지고
         *   각 변수들은 index를 이용해서 구분하게 된다.
         *
         * - index의 번호는 0부터 시작하는 정수
         * */

        // 1-1. 변수 선언
        int num;
        // Stack 영역에 int 자료형을 저장할 수 있는 공간
        // 4바이트를 생성하고 num이라는 이름을 부여

        // 1-2. 변수 대입
        num = 10;
        // 생성된 공간에 10을 대입

        // 1-3. 변수 사용
        System.out.println("num에 저장된 값 : " + num);
        //num이 작성된 자리에 num에 저장된 값을 읽어와서 출력

        System.out.println("--------------------------");

        // 2-1. 배열 선언
        int[] arr;

        // 2-2. 배열 할당
        arr = new int[3];

        // 2-3. 배열 요소 값 대입
        arr[0] = 1;
        arr[1] = 2;
        arr[2] = 3;

        // 2-4. 배열 요소 값 출력
        System.out.println(Arrays.toString(arr));

    }
}
