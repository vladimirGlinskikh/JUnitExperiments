package kz.zhelezyaka.junit.recursion;

public class Factorial {
    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            System.out.println("fibonacci(" + i + ") = " + factorial(i));
        }
    }

    private static int factorial(int value) {
        return (value < 2) ? 1 : factorial(value - 2) + factorial(value - 1);
    }
}
