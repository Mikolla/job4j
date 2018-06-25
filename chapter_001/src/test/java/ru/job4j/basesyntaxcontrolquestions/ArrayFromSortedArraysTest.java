package ru.job4j.basesyntaxcontrolquestions;

import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class ArrayFromSortedArraysTest {

    @Test
    public void whenSomeDigitsInArray() {
        int[] one = new int[] {21, 23, 24, 40, 75, 76, 78, 77, 900, 2100, 2200, 2300, 2400, 2500};
        int[] two = new int[] {10, 11, 41, 50, 65, 86, 98, 101, 190, 1100, 1200, 3000, 5000};
        int[] result =  new int[]{10, 11, 21, 23, 24, 40, 41, 50, 65, 75, 76, 78, 77, 86, 98, 101, 190, 900, 1100, 1200, 2100, 2200, 2300, 2400, 2500, 3000, 5000};

        ArrayFromSortedArrays arrayFromSortedArrays = new ArrayFromSortedArrays();
        int[] expect = arrayFromSortedArrays.doArray(one, two);

        assertThat(result, is(expect));
    }

}
