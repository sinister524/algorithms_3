package ru.geekbrains.algorithms3;

import java.util.Scanner;

public class Main {

    public static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Введите слово:");
        String str = scanner.next();
        Words.revers(str);
    }
}
