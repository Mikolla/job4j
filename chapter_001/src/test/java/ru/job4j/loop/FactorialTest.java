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


public class FactorialTest {
    /**
     * Test Factorial.
     */
    @Test
    public void facTest5() {
            Factorial fac = new Factorial();
            assertThat(fac.calc(5), is(120));
    }
    @Test
    public void facTest16() {
        Factorial fac = new Factorial();
        assertThat(fac.calc(6), is(720));
    }

}