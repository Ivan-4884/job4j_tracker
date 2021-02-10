package ru.job4j.oop;

public class Cat {
    private String name;

    public void giveNick(String nick) {
        this.name = nick;
    }

    public void show() {
        System.out.println(this.name);
    }

    public static void main(String[] args) {
        Cat gav = new Cat();
        gav.giveNick("gav");
        gav.show();
        System.out.println("food kotleta");
        Cat black = new Cat();
        black.giveNick("black");
        black.show();
        System.out.println("food fish");
    }

    /*public String soung() {
        String voice = "may-may";
        return voice;
    }
    public static void main(String[] args) {
        Cat peppy = new Cat();
        String say = peppy.soung();
        System.out.println("Peppy say " + say);
    }*/
}
