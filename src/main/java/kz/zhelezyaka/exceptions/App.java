package kz.zhelezyaka.exceptions;

public class App {
    public static void main(String[] args) {
        for (int i = 0; i < 2; i++) {
            f();
            System.err.println();
        }
    }

    private static void f() {
        for (int i = 0; i < 2; i++) {
            System.err.print(0);
//            if (true) throw new Error();
//            if (true) continue;
//            if (true) break;
            if (true) return;
            System.err.print(1);
        }
        System.err.print(2);
    }
}
