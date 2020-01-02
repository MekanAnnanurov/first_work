package com.epam.javacollections.optionaltask;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/*
* Занести стихотворение в список. Провести сортировку по возрастанию длин строк.
* */
public class Poem {
    private static final String POEMS =
             "From fairest creatures we desire increase," + "\n" +
             "That thereby beauty's rose might never die," + "\n" +
             "But as the riper should by time decease,\n" +
             "His tender heir might bear his memory:\n" +
             "But thou, contracted to thine own bright eyes,\n" +
             "Feed'st thy light'st flame with self-substantial fuel,\n" +
             "Making a famine where abundance lies,\n" +
             "Thyself thy foe, to thy sweet self too cruel.\n" +
             "Thou that art now the world's fresh ornament\n" +
             "And only herald to the gaudy spring,\n";

    public static void main(String[] args) {
        List<String> lines = Arrays.asList(POEMS.split("\n"));
        System.out.println("\n" + lines + "\n");

        Collections.sort(lines, new Comparator<String>() {
            @Override
            public int compare(String object1, String object2) {
                return object1.length() - object2.length();
            }
        });
        System.out.println(lines);
    }
}
