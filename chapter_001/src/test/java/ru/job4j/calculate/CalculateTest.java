package ru.job4j.calculate;

import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

/**
* Test.
*
* * @author Bondarenko Nikolay
* @version 01
* @since 02.06.2018
*/
public class CalculateTest {
/**
* Test echo.
*/ @Test
public void whenTakeNameThenTreeEchoPlusName() {
    String input = " Bondarenko Nikolay";
    String expect = "Echo, echo, echo :  Bondarenko Nikolay"; 
    Calculate calc = new Calculate();
    String result = calc.echo(input);
    assertThat(result, is(expect));
}
 
}