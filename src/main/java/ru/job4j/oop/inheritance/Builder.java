package ru.job4j.oop.inheritance;

public class Builder extends Engineer {
    private String structure;

    public Builder(String name, String surname, String education, String birthday, int years,
                   String structure) {
        super(name, surname, education, birthday, years);
        this.structure = structure;
    }

    public void struct() {
    }
}
