package com.pb.stetsuk.hw3;

import java.util.Arrays;
import java.util.Scanner;

public class Array {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int pos = 0;
        int sum = 0;
        int[] numbers = new int[10];

        System.out.println("Введите массив из элементов");
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = scanner.nextInt();
            if (numbers[i] > 0) {
                pos++;
                sum += numbers[i];
            }
        }
        System.out.println("До: " + Arrays.toString(numbers));
        int temp;
        for (int i = 0; i < numbers.length; i++) {
            for (int j = 0; j < numbers.length - 1; j++) {
                if (numbers[j] > numbers[j + 1]) {
                    temp = numbers[j];
                    numbers[j] = numbers[j + 1];
                    numbers[j + 1] = temp;
                }
            }
        }

        System.out.println("После: " + Arrays.toString(numbers));
        System.out.println("Сума элементов: " + sum);
        System.out.println("Положительных элементов: " + pos);
    }
}