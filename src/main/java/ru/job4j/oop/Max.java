package ru.job4j.oop;

public class Max {
    public static int max(int first, int second) {
        boolean max = first > second;
        return max ? first : second;
    }

    public static int max(int first, int second, int third) {
        return max(first, max(second, third));
    }

    public static int max(int first, int second, int third, int fourth) {
        return max(first, max(second, max(third, fourth)));
    }
}
