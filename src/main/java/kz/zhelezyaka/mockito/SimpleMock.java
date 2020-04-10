package kz.zhelezyaka.mockito;

import static org.mockito.Mockito.*;
import java.util.List;

public class SimpleMock {
    public static void main(String[] args) {
        List<String> list = mock(List.class);
        System.out.println(list.add("A"));
        System.out.println(list.get(-1));
        System.out.println(list.size());
        System.out.println(list.iterator());

        System.out.println(list.getClass().getName());
    }
}
