package com.epam.javafundamentals.optionaltask;

import java.util.*;

/**
 * Вывести числа в порядке возрастания (убывания) значений их длины.
 */
public class NumberAscendingDescending {

    public static void main(String[] args) {
        System.out.println("Введите количество чисел: ");
        Scanner scanner = new Scanner(System.in);
        int count = scanner.nextInt();
        List<String> numbers = fillList(count);
        numbers.sort(Comparator.comparingInt(String::length));
        System.out.println(numbers);
    }

    protected static List<String> fillList(int count) {
        System.out.println("Введите n строк, окончание ввода строк, завершите пустой строкой.");
        List<String> numbers = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < count; i++){
            numbers.add(scanner.nextLine());
        }
        return numbers;
    }
}
