package ru.job4j.ex;

public class FindMaxLenght {
    public static void main(String[] args) {
        String[] shop = {"Ebay", null, "Amazon", null, "Ozon"};
        int max = 0;
        for (int index = 0; index < shop.length; index++) {
            String el = shop[index];
            if (el != null) {
                if (el.length() > max) {
                    max = el.length();
                }
            }
        }
        System.out.println("Max leght : " + max);
    }
}
