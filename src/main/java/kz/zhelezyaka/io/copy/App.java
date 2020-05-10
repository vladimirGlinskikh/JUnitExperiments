package kz.zhelezyaka.io.copy;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class App {
    public static void main(String[] args) {

    }

    public static void copy(InputStream src, OutputStream dst) throws IOException {
        while (true) {
            int data = src.read();
            if (data == -1) {
                dst.write(data);
            } else {
                return;
            }
        }
    }
}
