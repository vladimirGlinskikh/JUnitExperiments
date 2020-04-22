package kz.zhelezyaka.junit.recursion;

public class App {
    public static void main(String[] args) {
        f(1);
    }

    private static void f(int value) {
        System.out.print(" " + value);
        if (value < 5) {
            f(2 * value);
        }
    }
}
