package com.epam.javafundamentals.maintask;

import java.util.Scanner;

/**
 * Приветствовать любого пользователя при вводе его имени через командную строку.
 */
public class WelcomeUser {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String name = scanner.next();
        System.out.println("Hello " + name);
    }
}
