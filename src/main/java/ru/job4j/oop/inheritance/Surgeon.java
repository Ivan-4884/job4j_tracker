package ru.job4j.oop.inheritance;

public class Surgeon extends Doctor{
    private int timeOperation;

    public Surgeon(String name, String surname, String education, String birthday, int years, int time) {
        super(name, surname, education, birthday, years);
        this.timeOperation = time;
    }

    public void timeOper() {
    }
}
