package main.java.ch04_inheritance_polymorphism.oop.model.vo;

public class Phone {
    private String model;
    private String color;

    public Phone() {
        System.out.println("Phone constructor");
    }

    public Phone(String model, String color) {
        this.model = model;
        this.color = color;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void pay() {
        System.out.println("결제하기");
    }

    @Override
    public String toString() {
        return "model=" + model + ", color=" + color;
    }
}
