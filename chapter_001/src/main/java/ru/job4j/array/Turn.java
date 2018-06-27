package ru.job4j.array;

import java.util.Arrays;

/**
 * array  reverse
 * @author Bondarenko.
 * @sinse 13.6.18.
 * @ver. 1.
 */
public class Turn {
    public int[] turn(int[] array) {
        for (int i = 0; i < array.length / 2; i++) {
            int temp;
            temp = array[array.length - i - 1];
            array[array.length - i - 1] = array[i];
            array[i] = temp;
        }
        return array;
    }


}
