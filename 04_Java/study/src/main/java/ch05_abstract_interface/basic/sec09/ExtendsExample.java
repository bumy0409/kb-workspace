package main.java.ch05_abstract_interface.basic.sec09;

public class ExtendsExample {
    public static void main(String[] args) {
        InterfaceCImpl impl = new InterfaceCImpl();
        InterfaceA implA = impl;
        implA.methodA();
        System.out.println();
        InterfaceB implB = impl;
        implB.methodB();
        System.out.println();
        InterfaceC implC = impl;
        implC.methodA();
        implC.methodB();
        implC.methodC();
    }
}
