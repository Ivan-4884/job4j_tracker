package ru.job4j.oop;

public class DummyDic {
    public String engToRus(String eng) {
        return "Неизвестное слово. " + eng;
    }

    public static void main(String[] args) {
        String str = "гыгы";
        DummyDic result = new DummyDic();
        System.out.println(result.engToRus(str));
    }
}
