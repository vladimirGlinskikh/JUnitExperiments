package kz.zhelezyaka.junit.money;

public class Calculator {
    public double add(double number1, double number2) {
        return number1 + number2;
    }

    public double divide(double number1, double number2) {
        if (number2 == 0) {
            throw new ArithmeticException("Cannot divide by zero");
        }
        return number1 / number2;
    }

    public double sqrt(double x) {
        if (x < 0) {
            throw new IllegalArgumentException("Cannot extract the square root of a negative value");
        }
        return Math.sqrt(x);
    }
}
