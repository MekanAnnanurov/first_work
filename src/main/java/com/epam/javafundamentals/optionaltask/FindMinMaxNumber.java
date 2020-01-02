package com.epam.javafundamentals.optionaltask;

import java.lang.reflect.Array;
import java.util.List;
import java.util.Scanner;

/**
 * Найти самое короткое и самое длинное число. Вывести найденные числа и их длину
 */
public class FindMinMaxNumber {
    protected static Scanner scanner;
    public static void main(String[] args) {

        int [] array = fillArray(5);

        printMaxNumber(array);
        printMinNumber(array);
    }

    protected static int[] fillArray(int count){
        System.out.println("Введите 5 чисел:");
        scanner = new Scanner(System.in);
        int[] array = new int[count];
        for(int i = 0; i < count - 1; i++){
            array[i] = scanner.nextInt();
        }
        return array;
    }

    protected static void printMaxNumber(int[] array){
        int maxValue = array[0];
        System.out.println("Самое большое число: ");
        for (int i = 0; i < array.length; i++) {
            if (array[i] > maxValue) {
                maxValue = array[i];
            }
        }
        System.out.println(maxValue);
        System.out.println("Количество цифр в большом числе = " + String.valueOf(maxValue).length());
    }

    protected static void printMinNumber(int[] array) {
        int minValue = array[0];
        for (int d = 0; d < array.length; d++) {
            if (array[d] < minValue) {
                minValue = array[d];
            }
        }
        System.out.println("Самое короткое число = " + minValue);
        System.out.println("Количество цифр в коротком числе = " + String.valueOf(minValue).length());
    }
}
