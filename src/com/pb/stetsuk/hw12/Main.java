package com.pb.stetsuk.hw12;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        PhoneBook phoneBook = new PhoneBook();
        Scanner scan = new Scanner(System.in);
        System.out.println("Ласкаво просимо");
        System.out.println("Для пошуку введіть 'search'");
        System.out.println("Для додавання контакту введіть 'add'");
        System.out.println("Для видалення контакту введіть 'remove'");
        System.out.println("Для показу списку контактів введіть 'show'");
        System.out.println("Для сортування по користувачу введіть 'names'");
        System.out.println("Для сортування по даті нарождения введіть 'dates'");
        System.out.println("Для редагування користувача введіть 'modify");
        System.out.println("Для відтворення даних в JSON введіть 'output'");
        System.out.println("Для запису даних в JSON введіть 'input'");
        System.out.println("Для виходу використовуйте 'quit'");
        String input = scan.nextLine();
        boolean run = true;
        while (run) {
            switch (input) {
                case "add":
                    phoneBook.Add();
                    System.out.println("Внесіть запит: ");
                    input = scan.nextLine();
                    break;
                case "search":
                    phoneBook.Search();
                    System.out.println("Внесіть запит: ");
                    input = scan.nextLine();
                    break;
                case "remove":
                    phoneBook.Remove();
                    System.out.println("Внесіть запит: ");
                    input = scan.nextLine();
                    break;
                case "modify":
                    phoneBook.Modify();
                    System.out.println("Внесіть запит: ");
                    input = scan.nextLine();
                    break;
                case "show":
                    System.out.println(phoneBook.showPhoneBook());
                    System.out.println("Внесіть запит: ");
                    input = scan.nextLine();
                    break;
                case "nameshow":
                    System.out.println(phoneBook.SortByName());
                    System.out.println("Внесіть запит: ");
                    input = scan.nextLine();
                    break;
                case "dateshow":
                    System.out.println(phoneBook.SortByDateOfBirth());
                    System.out.println("Внесіть запит: ");
                    input = scan.nextLine();
                    break;
                case "output":
                    phoneBook.toFile();
                    System.out.println("Внесіть запит: ");
                    input = scan.nextLine();
                    break;
                case "input":
                    phoneBook.fromFile();
                    input = scan.nextLine();
                    break;
                case "quit":
                    run = false;
                    System.out.println("До зустрічі");
                    break;
                default:
                    System.out.println("Не коректний запит, спробуйте ще раз.");
                    input = scan.nextLine();
                    break;
            }
        }
    }
}
