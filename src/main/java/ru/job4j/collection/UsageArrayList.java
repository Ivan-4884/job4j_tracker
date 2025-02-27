package ru.job4j.collection;

import java.util.ArrayList;

public class UsageArrayList {
    public static void main(String[] args) {
        ArrayList<String> names = new ArrayList<>();
        names.add("Petr");
        names.add("IvanD");
        names.add("Stepan");
        for (String a : names) {
            System.out.println(a);
        }
    }
}
