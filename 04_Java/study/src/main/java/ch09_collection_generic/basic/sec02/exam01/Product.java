package main.java.ch09_collection_generic.basic.sec02.exam01;

public class Product <K, M> {
    M model;
    K kind;

    public M getModel() {
        return model;
    }

    public void setModel(M model) {
        this.model = model;
    }

    public K getKind() {
        return kind;
    }

    public void setKind(K kind) {
        this.kind = kind;
    }
}
