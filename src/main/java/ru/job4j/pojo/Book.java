package ru.job4j.pojo;

public class Book {
    private String name;
    private short page;

    public Book(String name, short page) {
        this.name = name;
        this.page = page;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public short getPage() {
        return page;
    }

    public void setPage(short page) {
        this.page = page;
    }
}
