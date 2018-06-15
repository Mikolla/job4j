package ru.job4j.array;

/**
 * @author Bondarenko.
 * @since 15.6.18.
 * @version 1.
 */

public class MatrixCheck {
    /**
     * Check if diagonals contains all true or all false elements
     * @param data array
     * @return result
     */
    public boolean mono(boolean[][] data) {
        boolean result = true;
        for (int i = 0; i < data.length; i++) {
            if (data[1][1] != data[i][i] || data[1][1] != data[data.length - 1 - i][i]) {
             result = false;
             return result;
            }
        }
        return result;
    }
}