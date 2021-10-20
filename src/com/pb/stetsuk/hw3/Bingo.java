package com.pb.stetsuk.hw3;
import java.util.Random;
import java.util.Scanner;

public class Bingo {
    public static void main(String[] args) {
        Random random = new Random();
        Scanner scanner = new Scanner(System.in);
        int randomNum = random.nextInt(100) + 1;

        int attempt = 0;
        while (true) {
            System.out.println("Угадайте задуманое число от 1 до 100");
            System.out.println("Для выхода введите - -1");
            attempt++;
            int guess = scanner.nextInt();
            if (guess == randomNum) {
                System.out.println("Правильно");
                System.out.println("Использовано " + attempt + " попыток");
                break;

            } else if (guess > randomNum) {
                System.out.println("Высоко");

            } else {
                System.out.println("Низковато");
            } if (guess == -1) {
                System.out.println("Завершение");
                break;
            }
    }
}
}
