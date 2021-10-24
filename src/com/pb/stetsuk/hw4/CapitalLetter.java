package com.pb.stetsuk.hw4;
import java.util.Scanner;

public class CapitalLetter {
    public static void main(String[] args) {
        Scanner c = new Scanner(System.in);
        System.out.println("введите выражение");
        String str = c.nextLine();
        String upper = " ";
        Scanner scanner = new Scanner(str);

        while (scanner.hasNext()) {
            String r = scanner.next();
            upper += Character.toUpperCase(r.charAt(0)) + r.substring(1) + " ";
        }
        System.out.println(upper.trim());
    }
}
