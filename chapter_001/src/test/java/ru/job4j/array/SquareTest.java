package ru.job4j.array;

/**
 * Test for Square quads array.
 *
 * @author Bondarenko Nikolay
 * @version 1
 * @since 12.06.2018
 */


import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

    public class SquareTest {
        @Test
        public void whenBound3Then149() {
            int bound = 3;
            Square square = new Square();
            int[] rst = square.calculate(bound);
            int[] expect = new int[] {1, 4, 9};
            assertThat(rst, is(expect));
        }

        @Test
        public void whenBound5Then() {
            int bound = 5;
            Square square = new Square();
            int[] rst = square.calculate(bound);
            int[] expect = new int[] {1, 4, 9, 16, 25};
            assertThat(rst, is(expect));
        }

        @Test
        public void whenBound6Then() {
            int bound = 6;
            Square square = new Square();
            int[] rst = square.calculate(bound);
            int[] expect = new int[] {1, 4, 9, 16, 25, 36};
            assertThat(rst, is(expect));
        }

    }

