package main.java.ch03_class.basic.sec08.exam02;

public class Computer {
    public int sum(int a, int b, int c){
        return a + b + c;
    }

    public int sum(int a, int b, int c, int d, int e){
        return a + b + c  + d + e;
    }

    public int sum(int[] arr) {
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        return sum;
    }
}
