package com.epam.javafundamentals.optionaltask;


import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import java.util.Comparator;

public class MatrixAscending {
    protected static Scanner scan;

    public static void main(String[] args) {
        System.out.println("Enter n: ");
        scan = new Scanner(System.in);
        int n = Integer.parseInt(scan.nextLine());
        Integer[][] matrix = fillMatrix(n);

        List<Integer[]> sortedMatrix = sortMatrix(matrix);
        printMatrix(sortedMatrix, n);

    }

    protected static void printMatrix(List<Integer[]> matrix, int n){
        System.out.println(n);
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(matrix.get(i)[j] + "\t");
            }
            System.out.println();
        }
    }

    protected static List<Integer[]> sortMatrix(Integer[][] matrix){
        System.out.println("Enter k(starting from 0): ");
        scan = new Scanner(System.in);
        final int k = Integer.parseInt(scan.nextLine());
        List<Integer[]> matrixList = Arrays.asList(matrix);
        Collections.sort(matrixList, new Comparator<Integer[]>() {
            public int compare(Integer[] o1, Integer[] o2) {
                return o1[k] - o2[k];
            }
        });
        return matrixList;
    }

    protected static Integer[][] fillMatrix(int number){
        System.out.println("Enter matrix values:");
        Integer[][] matrix = new Integer[number][number];
        for (int i = 0; i < number; i++) {
            for (int j = 0; j < number; j++) {
                System.out.println("Value [" + i + "][" + j + "]:");
                matrix[i][j] = scan.nextInt();
            }
        }
        return matrix;
    }
}
