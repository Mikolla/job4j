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
public class TriangleTest {

    @Test
    public void whenDrawTriangle() {
		Triangle triangle = new Triangle();
		String result = triangle.draw();
		String expected = new StringBuilder()
        .append("+")
	    .append(System.lineSeparator() + "++")
        .append(System.lineSeparator() + "+ +")
        .append(System.lineSeparator() + "+  +")
        .append(System.lineSeparator() + "+   +")
        .append(System.lineSeparator() + "++++++")
		.toString();								
			assertThat(result, is(expected));		       
    }	
}