package ru.job4j.array;

import java.util.Arrays;

/**
 * Matrix multiplication table example
 * @author Bondarenko.
 * @since  14.6.18.
 * @version. 1.
 */
public class Matrix {
    /**
     * multiplication table creation
     * @param size of table
     * @return table array
     */
    public int[][] multiple(int size) {
        int[][] table = new int[size][size];
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
           table[i][j] = (i + 1) * (j + 1);
            }
        }
        return table;
    }
}
