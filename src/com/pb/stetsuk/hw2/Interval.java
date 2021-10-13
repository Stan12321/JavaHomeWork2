package com.pb.stetsuk.hw2;
import java.util.Scanner;

public class Interval {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите переменную");
        int n = scanner.nextInt();
        System.out.println(n);

        if (n >= 0 && n < 14) {
            System.out.println("[0 -14]");
        } else {
            if (n >= 15 && n < 35) {
                System.out.println("[15 - 35]");
            } else {
                if (n > 36 && n <= 50) {
                    System.out.println("[36 - 50]");
                } else {
                    if (n > 51 && n <= 100) {
                        System.out.println("[51 - 100]");
                    } else {
                        if (n == 101) {
                            System.out.println("Error");
                        }
                    }
                }
            }
        }
    }
}

