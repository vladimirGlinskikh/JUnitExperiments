package kz.zhelezyaka.exceptions;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class App05 {
    public static void main(String[] args) throws IOException {
        FileOutputStream out = null;
        FileInputStream in = null;
        try {
            in = new FileInputStream("/test.txt");
            out = new FileOutputStream("/copy.txt");
            out.write(in.read());
            out.flush();
        } finally {
            try {
                if (out != null) {
                    out.close();
                }
            } finally {
                if (in != null) {
                    in.close();
                }
            }
        }
    }
}
