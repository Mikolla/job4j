package ru.job4j.btcmp;

import org.testng.annotations.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThat;


public class Btcmpsixs {
    int a, b, c;
    public static long getVolume(int a, int b, int c) {
        return (long) (a * b * c) * 1000;
    }

    public static void main(String[] args) {
        System.out.println(getVolume(25,5,2));
    }
    @Test
    public void pullTest() {
        assertEquals( getVolume(25,5,2), 250000);
        }
}
