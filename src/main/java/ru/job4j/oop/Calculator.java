package ru.job4j.oop;

public class Calculator {
    private static int x = 5;

    public static int sum(int y) {
        return x + y;
    }

    public static int minus(int y) {
        return y - x;
    }

    public int divide(int y) {
        return y / x;
    }

    public int sumAllOperation(int y) {
        int sum = sum(y);
        int minus = minus(y);
        int divide = divide(y);
        return sum + minus + divide;
    }

    public static void main(String[] args) {
        int y = 15;
        int result = sum(y);
        int result2 = minus(y);
        Calculator calculator = new Calculator();
        int result3 = calculator.divide(y);
        System.out.println(result + "\n" + result2 + "\n" + result3
            + "\n" + calculator.sumAllOperation(y));
        }
}
