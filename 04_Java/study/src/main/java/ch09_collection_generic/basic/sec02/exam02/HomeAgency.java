package main.java.ch09_collection_generic.basic.sec02.exam02;

public class HomeAgency implements Rentable<Home> {
    @Override
    public Home rent() {
        return new Home();
    }
}
