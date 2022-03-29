package edu.codingbat.warmup1;

import org.junit.Test;

import static org.junit.Assert.*;

public class FrontBackTest {
    @Test
    public void shouldReturnNewStringWith1stAndLastExchanged1() {
        FrontBack object = new FrontBack();
        String expected = "ehocolatC";
        String actual = object.frontBack("Chocolate");
        assertEquals(expected,actual);

    }
    @Test
    public void shouldReturnNewStringWith1stAndLastExchanged2() {
        FrontBack object = new FrontBack();
        String expected = "oellh";
        String actual = object.frontBack("hello");
        assertEquals(expected,actual);

    }
    @Test
    public void shouldReturnNewStringWith1stAndLastExchanged3() {
        FrontBack object = new FrontBack();
        String expected = "a";
        String actual = object.frontBack("a");
        assertEquals(expected,actual);

    }
}