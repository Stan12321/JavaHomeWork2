package com.pb.stetsuk.hw2;
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        char operator;
        double number1, number2;
        Scanner input = new Scanner(System.in);

        System.out.println("число 1");
        number1 = input.nextDouble();

        System.out.println("число 2");
        number2 = input.nextDouble();

        System.out.println("Выберите действие: ");
        operator = input.next().charAt(0);

        input.close();

        switch (operator) {
            case '+':
                System.out.printf("%f + %f = %f", number1, number2, (number1 + number2));
                break;
            case '-':
                System.out.printf("%f - %f = %f", number1, number2, (number1 - number2));
                break;
            case '*':
                System.out.printf("%f * %f = %f", number1, number2, (number1 * number2));
                break;
            case '/':
                if (number2 != 0)
                System.out.printf("%f / %f = %f", number1, number2, (number1 / number2));
                else
                System.out.println("низя");
                break;

            default:
                System.out.printf("%c Error");
        }
    }
}

