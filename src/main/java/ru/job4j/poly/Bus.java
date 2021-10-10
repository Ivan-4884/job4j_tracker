package ru.job4j.poly;

public class Bus implements Transport {
    @Override
    public void drive() {
        System.out.println("Автобус едет");
    }

    @Override
    public void passengers(int pass) {
        System.out.println("В автобусе едет: " + pass + "пассажир(ов)");
    }

    @Override
    public double refuel(double fuel) {
        return fuel * 48.36;
    }
}
