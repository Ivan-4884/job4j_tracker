package ru.job4j.oop;

public class Train implements Vehicle {
    @Override
    public void move() {
        System.out.println("Поезд передвигается по рельсам.");
    }

    @Override
    public void fuel() {
        System.out.println("Поезд использует ввиде топлива электричество.");
    }
}
