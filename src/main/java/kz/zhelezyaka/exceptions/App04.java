package kz.zhelezyaka.exceptions;

public class App04 {
    public static void main(String[] args) throws Exception{
        try {
            try {
                throw new Error();
            } catch (Error e) {
                throw new RuntimeException(e);
            }
        } catch (RuntimeException e) {
            System.err.println(e);
            System.err.println(e.getCause());
            System.err.println(e.getCause().getCause());
        }
    }
}
