package kz.zhelezyaka.io.copy;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.URL;

public class App {
    public static void main(String[] args) throws IOException {
        InputStream src = new URL("http://google.com").openStream();
        OutputStream dst = new FileOutputStream("/././tmp/google.txt");
        copy(src, dst);
    }

    public static void copy(InputStream src, OutputStream dst) throws IOException {
        while (true) {
            int data = src.read();
            if (data != -1) {
                dst.write(data);
            } else {
                return;
            }
        }
    }
}
