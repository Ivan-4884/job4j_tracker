package ru.job4j.tracker;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class StartUI {


    public static void main(String[] args) {
        Item datatime = new Item();
        Item datatimeone = new Item(2021);
        Item datatimetwo = new Item(777, "test");
        LocalDateTime created = datatime.getCreated();
        /*DateTimeFormatter format = DateTimeFormatter.ofPattern("dd-MMMM-EEEE-yyyy HH:mm:ss");
        String createdformat = created.format(format);
        System.out.println(createdformat);*/
        System.out.println(datatime);
        System.out.println(datatimeone);
        System.out.println(datatimetwo);
        System.out.println(created);
    }
}
