package ru.job4j.loop;
/**
 * @author Bondarenko
 * @version $Id$
 * @since 0.1
 */

public class Counter {
    /**
     * Считает сумму четных чисел в заданном интервале.
     * @param  start, finish.
     * @return Сумма.
     */
    public int add(int start, int finish) {
        int sum = 0;

        for (int i = start; i <= finish; i++) {
            if (i % 2 == 0) {
                sum += i;
                }
        }
        return sum;
    }
}
