package ru.job4j.array;

/**
 * BubbleSort
 * @author Bondarenko.
 * @since  14.6.18.
 * @version. 1.
 */

public class BubbleSort {

    /**
     * array sorting method
     * @param a - array for sorting
     * @return a - already sorted array
     */

    public int[] sort(int[] a) {
        for (int i = a.length - 1; i > 0; i--) {
            for (int j = 0; j < i; j++) {
              if (a[j] > a[j + 1]) {
                int tmp = a[j];
                a[j] = a[j + 1];
                a[j + 1] = tmp;
            }
        }
    }
    return a;
    }
}


