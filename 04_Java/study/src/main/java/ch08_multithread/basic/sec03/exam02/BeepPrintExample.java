package main.java.ch08_multithread.basic.sec03.exam02;

public class BeepPrintExample {
    public static void main(String[] args) {
        Thread thread = new Thread(new Thread1());
        thread.start();
        try {
            for (int i = 0; i < 5; i++) {
                Thread.sleep(500);
                System.out.println("띵");
            }
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}
