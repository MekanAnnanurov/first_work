package com.epam.javafundamentals.maintask;

import java.util.Scanner;

/**
 * Отобразить в окне консоли аргументы командной строки в обратном порядке.
 */
public class ArgumentsInReverseOrder {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите последовательность цифр: ");
        int value = scanner.nextInt();
        int mirror = 0;
        while (value != 0) {
            mirror = mirror * 10 + (value % 10);
            value = value / 10;
        }
        System.out.println("Обратная последовательность цифр: " + mirror);
    }
}
