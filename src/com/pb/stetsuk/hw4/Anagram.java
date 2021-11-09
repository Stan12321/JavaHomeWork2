package com.pb.stetsuk.hw4;

import java.util.Arrays;
import java.util.Scanner;

public class Anagram {
    public static boolean anagram(String str1, String str2) {
        if (str1.length() != str2.length())
            return false;
        else
        {
            String first = str1;
            first = first.replaceAll("[^A-Za-zА-Яа-я0-9]", "");
            String second = str2;
            second = second.replaceAll("[^A-Za-zА-Яа-я0-9]", "");
            char[] a = first.toLowerCase().toCharArray();
            char[] b = second.toLowerCase().toCharArray();
            Arrays.sort(a);
            Arrays.sort(b);

            return Arrays.equals(a, b);
        }
    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("введите строку1: ");
        String str1 = scan.nextLine();

        System.out.println("введите строку2: ");
        String str2 = scan.nextLine();

        if (anagram(str1, str2)) {
            System.out.println("анаграмма");
        } else {
            System.out.println("не анаграмма");
        }
    }
}
