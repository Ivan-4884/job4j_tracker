package ru.job4j.ex;

public class Fact {
    public static void main(String[] args) {
        int rls = new Fact().calc(-1);
    }

    public int calc(int n) {
        if (n < 0) {
            throw new IllegalArgumentException("N could not be less then 0");
        }
        int rsl = 1;
        for (int index = 2; index <= n; index++) {
            rsl *= index;
        }
        return rsl;
    }
}
