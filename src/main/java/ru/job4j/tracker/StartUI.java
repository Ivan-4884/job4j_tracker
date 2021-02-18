package ru.job4j.tracker;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class StartUI {


    public static void main(String[] args) {
        Item datatime = new Item();
        LocalDateTime created = datatime.getCreated();
        DateTimeFormatter format = DateTimeFormatter.ofPattern("dd-MMMM-EEEE-yyyy HH:mm:ss");
        String createdformat = created.format(format);
        System.out.println(createdformat);
    }
}
