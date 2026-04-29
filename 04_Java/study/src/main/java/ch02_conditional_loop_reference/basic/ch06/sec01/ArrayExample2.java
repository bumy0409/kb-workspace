package main.java.ch02_conditional_loop_reference.basic.ch06.sec01;

import java.util.Random;
import java.util.Scanner;

public class ArrayExample2 { // 예제 작성용 클래스
    public void ex1() {
        int[] arr = new int[4];

        // 배열의 길이 : 배열명.length
        System.out.println("배열의 길이 : " + arr.length);

        for (int i = 0; i < arr.length; i++) {
            arr[i] = i;
        }

        for (int i : arr) {
            System.out.print(i + " ");
        }
    }

    public void ex2() {
        // 숙제
        // 입력 받은 양의 정수 만큼의
        // 크기를 가지는 배열 만들기

        // [평균 점수 구하기]
        // 입력 받을 인원 수 : 4
        // 1번 점수 입력 : 100
        // 2번 점수 입력 : 20
        // 3번 점수 입력 : 50
        // 4번 점수 입력 : 90

        // 합계 : 260 점
        // 평균 : 65 점
        //-----------------------------------
        Scanner sc = new Scanner(System.in);
        System.out.print("입력 받을 인원 수 : ");
        int num = sc.nextInt();
        int sum = 0;
        int[] arr = new int[num];
        for (int i = 0; i < num; i++) {
            System.out.print((i + 1) + "번 점수 입력 : ");
            arr[i] = sc.nextInt();
            sum += arr[i];
        }

        System.out.print("합계 : " + sum);
        System.out.println();
        System.out.print("평균 : " + (double) sum / num);

    }

    public void ex3() {
        // 저녁 메뉴 뽑기

        String[] menu = {"햄버거", "돈까스", "삼겹살", "아구찜", "파스타", "서브웨이"};

//        int random = new Random().nextInt(menu.length);
        int random = (int) (Math.random() * 6);
        System.out.println("저녁 메뉴 추천 : " + menu[random]);
    }
}
