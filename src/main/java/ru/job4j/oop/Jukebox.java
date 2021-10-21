package ru.job4j.oop;

public class Jukebox {
    public void music(int position) {
        if (position == 1) {
            System.out.println("Пусть бегут неуклюже");
        } else {
            if (position == 2) {
            System.out.println("Спокойной ночи");
            } else {
            System.out.println("Пусня не найдена");
            }
        }
    }

    public static void main(String[] args) {
        int index = 3;
        Jukebox petya = new Jukebox();
        petya.music(index);
    }
}
