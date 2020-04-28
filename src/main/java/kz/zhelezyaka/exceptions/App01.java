package kz.zhelezyaka.exceptions;

public class App01 {
    public static void main(String[] args) {
        System.err.println("f:before");
        try {
            f();
        } catch (Exception e) {
            System.err.println("f:catch");
        }
        System.err.println("f:after");
    }

    private static void f() {
        System.err.println("g:before");
        g();
        System.err.println("g:after");
    }

    private static void g() {
        throw new RuntimeException();
    }
}
