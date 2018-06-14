package ru.job4j.array;

import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

/**
 * tests for BubbleSort
 * @author Bondarenko.
 * @since 14.6.18.
 * @version 1.
 */

public class BubbleSortTest {


    @Test
    public void whenSomeDigitsInArray() {
        int[] expect = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9};
        int[] result = (new BubbleSort()).sort(new int[]{1, 3, 2, 5, 4, 9, 7, 8, 6});
        assertThat(result, is(expect));
    }


    @Test
    public void whenSomeNumbersInArray() {
        int[] expect = new int[]{10, 20, 30, 40, 50, 60, 70, 80, 90};
        int[] result = (new BubbleSort()).sort(new int[]{90, 30, 20, 50, 40, 10, 70, 80, 60});
        assertThat(result, is(expect));
    }


}
