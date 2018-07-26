

package ru.job4j.pseudo;

import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

/**
* Test.
*
* @author Bondarenko Nikolay
* @version 01
* @since 24.07.2018
*/

public class PaintTest {

    @Test
    public void whenDrawSquare() {
        PrintStream stdout = System.out;
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));
        new Paint().draw(new Square());
        assertThat(
                new String(out.toByteArray()),
                is(
                        new StringBuilder()
                                                         .append("+++++")
                                .append(System.lineSeparator() + "+   +")
                                .append(System.lineSeparator() + "+   +")
                                .append(System.lineSeparator() + "+++++")
                                .append(System.lineSeparator())
                                .toString()
                )
        );
        System.setOut(stdout);
    }

    @Test
    public void whenDrawTriangle() {
        PrintStream stdout = System.out;
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));
        new Paint().draw(new Triangle());
        assertThat(
                new String(out.toByteArray()),
                is(
                        new StringBuilder()
        .append("+")
	    .append(System.lineSeparator() + "++")
        .append(System.lineSeparator() + "+ +")
        .append(System.lineSeparator() + "+  +")
        .append(System.lineSeparator() + "+   +")
        .append(System.lineSeparator() + "++++++" + System.lineSeparator())
		.toString()
                )
        );
        System.setOut(stdout);
    }
}