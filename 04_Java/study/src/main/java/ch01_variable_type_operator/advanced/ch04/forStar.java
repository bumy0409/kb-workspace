package main.java.ch01_variable_type_operator.advanced.ch04;

public class forStar {
    public static void main(String[] args) {
        for (int i = 5; i >= 1; i--) {
            for (int j = 0; j < i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
