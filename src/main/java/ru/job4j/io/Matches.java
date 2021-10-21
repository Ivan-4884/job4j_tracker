package ru.job4j.io;

import java.util.Scanner;

public class Matches {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Игра 11.");
        boolean turn = true;
        int count = 11;
        while (count > 0) {
            String player = turn ? "Первый игрок" : "Второй игрок";
            System.out.println(player + " введите число от 1 до 3:");
            int matches = 0;
            boolean run = true;
            while (run) {
                matches = Integer.parseInt(input.nextLine());
                if ((matches <= 0) || (matches > 3)) {
                    System.out.println("Введенное вами число не попадает в диапазон чисел "
                            + "от 1 до 3");
                } else if ((count - matches) < 0) {
                    System.out.println("Вы ввели число " + matches + ", а остаток спичек "
                            + "равен " + count);
                    System.out.println("Введите число " + count + " и будет Вам счастье =)");
                } else {
                    run = false;
                }
            }
            turn = !turn;
            count -= matches;
            System.out.println("Осталось: " + count + " спичек");
        }
        if (!turn) {
            System.out.println("Выиграл первый игрок");
        } else {
            System.out.println("Выиграл второй игрок");
        }
    }
}
