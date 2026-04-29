package main.java.ch02_conditional_loop_reference.basic.ch06.sec01;

import java.util.Arrays;

public class ArrayExample3 {
    public void ex1() {
        // 얕은 복사
        int[] arr = {1, 2, 3, 4, 5};
        int[] copyArr = arr;
        arr[2] = 100;
        System.out.println(Arrays.toString(arr));
        System.out.println(Arrays.toString(copyArr));

    }

    public void ex2() {
        // 깊은 복사
        int[] arr = {1, 2, 3, 4, 5};
        int[] arr2 = Arrays.copyOf(arr, arr.length);
        //1. for문
        for (int i : arr) {
            arr2[i] = arr[i];
        }

        //2. System.ArrayCopy(원본 배열명, 원본 복사 시작 인덱스, 복사배열명, 복사배열의 삽입시작 인덱스, 복사길이)
        System.arraycopy(arr, 0, arr2, 0, arr.length);

        //3. 복사할 배열 참조 변수 = Arrays.copyOf(원본 배열, 복사할 길이)
        int[] copyArr = Arrays.copyOf(arr, arr.length);

    }
}
