package ru.job4j.io;

import java.util.Scanner;
import java.util.Random;

public class MagicBall {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Я великий Оракул. Что ты хочешь узанать?");
        System.out.print("Задайте закрытый вопрос: ");
        input.nextLine();
        int answer = new Random().nextInt(3);
        if (answer == 0) {
            System.out.println("Yes");
        } else if (answer == 1) {
            System.out.println("No");
        } else
            System.out.println("It could be");
    }
}
