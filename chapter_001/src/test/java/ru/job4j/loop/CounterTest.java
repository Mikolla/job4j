package ru.job4j.loop;

import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

/**
 * Test.
 *
 * @author Bondarenko Nikolay
 * @version 0125
 * @since 10.06.2018
 */


public class CounterTest {
    /**
     * Test Counter.
     */
    @Test
    public void countTester() {

        int start = 1;
        int finish = 10;
        Counter cou = new Counter();
        System.out.println(cou.add(start, finish));
        int result = cou.add(start, finish);
        assertThat(result, is(30));
    }

}