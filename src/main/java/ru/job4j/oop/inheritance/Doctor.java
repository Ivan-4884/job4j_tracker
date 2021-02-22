package ru.job4j.oop.inheritance;

public class Doctor extends Profession {
    private int years;

    public Doctor(String name, String surname, String education, String birthday, int years) {
        super(name, surname, education, birthday);
        this.years = years;
    }


    public void scool() {
    }
}
