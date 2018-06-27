package ru.job4j.array;

import java.util.Arrays;

/**
 * /**
 * @author Bondarenko.
 * @since 15.6.18.
 * @version 1.
 */
public class ArrayDuplicate {
    /**
     * Duplicate remover
     * @param array source
     * @return array without duplicates
     */
    public String[] remove(String[] array) {
        int uniq = array.length;
        for (int out = 0; out < uniq; out++) {
             for (int in = out + 1; in < uniq; in++) {
              if (array[out].equals(array[in])) {
                  String temp = array[in];
                 array[in] = array[uniq - 1];
                 array[uniq - 1] = temp;
                  uniq--;
                  in--;
              }
             }
        }
        return Arrays.copyOf(array, uniq);
    }
}
