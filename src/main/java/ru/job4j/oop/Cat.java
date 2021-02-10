package ru.job4j.oop;

public class Cat {
    private String food;
    private String name;

    public void eat(String meat) {
        this.food = meat;
    }

    public void giveNick(String nick) {
        this.name = nick;
    }

    public void show() {
        System.out.print(this.name);
        System.out.println(this.food);
    }

    public static void main(String[] args) {
        Cat gav = new Cat();
        gav.giveNick("gav - ");
        gav.eat("kotleta");
        gav.show();
        Cat black = new Cat();
        black.giveNick("black - ");
        black.eat("fish");
        black.show();
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
