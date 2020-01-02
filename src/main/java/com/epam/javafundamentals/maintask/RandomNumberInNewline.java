package com.epam.javafundamentals.maintask;

import java.util.Scanner;

/**
 * Вывести заданное количество случайных чисел с переходом и без перехода на новую строку
 */
public class RandomNumberInNewline {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ввести количество чисел: ");
        int[] array = new int[scanner.nextInt()];

        System.out.print("Ввести целые цисла: ");

        for (int i = 0; i < array.length; i++) {
            array[i] = scanner.nextInt();
        }
        print(array);
    }

    public static void print(int[] array){
        for (int i : array) {
            System.out.println(i);
            System.out.print(i);
        }
    }
}
