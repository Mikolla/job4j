package ru.job4j.array;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

/**
 * tests for ArrauDuplicate
 * @author Bondarenko.
 * @since 15.6.18.
 * @version 1.
 */

public class ArrayDuplicateTest {
    @Test
    public void whenRemoveDuplicatesThenArrayWithoutDuplicate() {
        String[] expect = new String[]{"Привет", "Мир", "Супер"};
        String[] result = (new ArrayDuplicate()).remove(new String[]{"Привет", "Мир", "Привет", "Супер", "Мир"});
        assertThat(result, is(expect));
    }

    @Test
    public void whenRemoveDuplicatesThenBigArrayWithoutDuplicate() {
        String[] expect = new String[]{"1 ", "7 ", "2 ", "6 ", "3 ", "5 ", "4 "};
        String[] result = (new ArrayDuplicate()).remove(new String[]{"1 ", "1 ", "2 ", "2 ", "3 ", "3 ", "4 ", "4 ", "4 ", "5 ", "6 ", "7 "});
        assertThat(result, is(expect));
    }
}