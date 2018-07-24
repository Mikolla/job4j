package ru.job4j.pseudo;

import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;


public class TriangleTest {

    @Test
    public void whenDrawTriangle() {
		Triangle triangle = new Triangle();
		String result = triangle.draw();
		String expected = new StringBuilder()
        .append("+")
	    .append("\r\n++")
        .append("\r\n+ +")
        .append("\r\n+  +")
        .append("\r\n+   +")
        .append("\r\n++++++")
		.toString();
								
			assertThat(result, is(expected));					
        
    }
	
}