package kz.zhelezyaka.JUnitCore.arrays;

import java.util.Arrays;
import java.util.function.IntPredicate;

public class PositiveNumbers {
    public static int[] getPositiveSortedNumbers(int[] arrayOfNumbers) {
        IntPredicate predicate = n -> n >= 0;
        Arrays.stream(arrayOfNumbers)
                .filter(predicate)
                .sorted()
                .forEach(System.out::println);
        return arrayOfNumbers;
    }
}
