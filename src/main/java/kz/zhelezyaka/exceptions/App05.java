package kz.zhelezyaka.exceptions;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class App05 {
    public static void main(String[] args) throws IOException {
        try (FileInputStream in = new FileInputStream("/test.txt");
             FileOutputStream out = new FileOutputStream("/copy.txt")) {
            out.write(in.read());
            out.flush();
        }
    }
}
