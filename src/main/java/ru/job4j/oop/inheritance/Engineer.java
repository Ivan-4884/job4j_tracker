package ru.job4j.oop.inheritance;

public class Engineer extends Profession {
    private int years;

    public Engineer(String name, String surname, String education, String birthday, int years) {
        super(name, surname, education, birthday);
        this.years = years;
    }

    public void scool() {
    }
}
