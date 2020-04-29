package kz.zhelezyaka.exceptions;

public class App03 {
    public static void main(String[] args) {
        System.err.println("f:before");
        try {
            f();
        } finally {
            System.err.println("f:finally");
        }
        System.err.println("f:after");
    }

    private static void f() {
        System.err.println("g:before");
        try {
            g();
        } catch (Error e) {
            System.err.println("g:catch");
        }
        System.err.println("g:after");
    }

    private static void g() {
        throw new Error();
    }
}
