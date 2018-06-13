package ru.job4j.loop;

import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

/**
 * Test.
 *
 * @author Bondarenko Nikolay
 * @version 012
 * @since 02.06.2018
 */
public class FindLoopTest {

    @Test
    public void  whenArrayHasLengh10Then1() {
        FindLoop findLoop = new FindLoop();
        int[] arraySample = new int[] {5, 10, 3, 8, 2};
        assertThat(findLoop.indexOf(arraySample, 10), is(1));

    }

    @Test
    public void  whenArrayHasLengh12Then1() {
        FindLoop findLoop = new FindLoop();
        int[] arraySample = new int[] {5, 10, 3, 8, 2, 12, 35};
        assertThat(findLoop.indexOf(arraySample, 12), is(5));

    }

    @Test
    public void  whenArrayHasNoElement() {
        FindLoop findLoop = new FindLoop();
        int[] arraySample = new int[] {5, 10, 3, 8, 2, 12, 35};
        assertThat(findLoop.indexOf(arraySample, 67), is(-1));

    }

}
