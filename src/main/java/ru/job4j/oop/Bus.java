package ru.job4j.oop;

public class Bus implements Vehicle {
    @Override
    public void move() {
        System.out.println("Автобус передвигается по дороге.");
    }

    @Override
    public void fuel() {
        System.out.println("Автобус испоьзует ввиде топлива бензин.");
    }
}
