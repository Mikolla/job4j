package ru.job4j.pseudo;

import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;


public class SquareTest {

    @Test
    public void whenDrawSquare() {
		Square square = new Square();
		String result = square.draw();
		String expected = new StringBuilder()
                                                         .append("+++++")
                                .append(System.lineSeparator() + "+   +")
                                .append(System.lineSeparator() + "+   +")
                                .append(System.lineSeparator() + "+++++")
                                .toString();
								
			assertThat(result, is(expected));					
        
    }
	
}