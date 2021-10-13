package com.pb.stetsuk.hw2;
import java.util.Scanner;

public class Calculator {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int x = getInt();
        int y = getInt();
        char operation = getOperation();
        int result = calc(x, y, operation);
        System.out.println("Результат: " + result);
    }
        public static int getInt() {
            System.out.print("число: ");
            int num;
            if (scanner.hasNextInt()) {
                num = scanner.nextInt();
            } else {
                System.out.println("Error");
                scanner.next();
                num = getInt();
            }
            return num;
        }

    public static char getOperation() {
        System.out.print("Введите знак: ");
        char operation;
        if (scanner.hasNext()) {
            operation = scanner.next().charAt(0);
        } else {
            System.out.println("Error");
            scanner.next();
            operation = getOperation();
            }
        return operation;
    }

    public static int calc (int num1, int num2, char operation) {
        int y;
        switch (operation) {
            case '+':
                y = num1 + num2;
                break;
            case '-':
                y = num1 - num2;
                break;
            case '*':
                y = num1 * num2;
                break;
            case '/':
                y = num1 / num2;
                break;
            default:
                System.out.println("Введите переменную");
                y = calc(num1, num2, getOperation());
        }
        return y;
    }
}
