package com.epam.javacollections.optionaltask;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * Ввести строки из файла, записать в список. Вывести строки в файл в обратном порядке.
 */
public class LinesReverseOrder {
    private static final String FILE_PATH = "src/main/resources/TextFile";

    public static void main(String[] args) {
        File file = new File(FILE_PATH);

        List<String> strings = readFromFile(file);

        System.out.println(strings);

        writeToFileInReverseOrder(file, reorderList(strings));
    }

    private static void writeToFileInReverseOrder(File file, List<String> strings){
        FileWriter fr = null;
        BufferedWriter br = null;
        try {
            fr = new FileWriter(file, true);
            br = new BufferedWriter(fr);
            for (String str : strings) {
                br.newLine();
                br.write(str);
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                br.close();
                fr.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    private static List<String> readFromFile(File file) {
        List<String> strings = new ArrayList<>();
        Scanner scanner = null;
        try {
            scanner = new Scanner(file);
            while (scanner.hasNextLine()) {
                strings.add(scanner.nextLine());
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } finally {
            scanner.close();
        }
        return strings;
    }

    private static List<String> reorderList(List<String> strings) {
        List<String> reverseList = new ArrayList<>();
        for (int i = strings.size(); i > 0; i--) {
            reverseList.add(strings.get(i - 1));
        }
        return reverseList;
    }
}
