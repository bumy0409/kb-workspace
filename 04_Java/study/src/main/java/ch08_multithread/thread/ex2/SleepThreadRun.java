package main.java.ch08_multithread.thread.ex2;

public class SleepThreadRun {
    public static void main(String[] args) {
        Thread sleepThread = new Thread(new SleepThread());
        sleepThread.start();
    }


}
