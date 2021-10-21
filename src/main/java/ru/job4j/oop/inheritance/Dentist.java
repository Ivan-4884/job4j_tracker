package ru.job4j.oop.inheritance;

public class Dentist extends Doctor {
    private String diagnosis;

    public Dentist(String name, String surname, String education, String birthday, int years,
                   String diagnos) {
        super(name, surname, education, birthday, years);
        this.diagnosis = diagnos;
    }

    public void diagnos() {
    }
}
