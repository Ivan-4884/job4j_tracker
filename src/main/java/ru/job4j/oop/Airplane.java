package ru.job4j.oop;

public class Airplane implements Vehicle {
    @Override
    public void move() {
        System.out.println("Самолет передвигается по воздуху.");
    }

    @Override
    public void fuel() {
        System.out.println("Самолет использует ввиде топлава керосин.");
    }
}
