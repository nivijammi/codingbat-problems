package edu.codingbat.warmup1;

import org.junit.Test;

import static org.junit.Assert.*;

public class Close10Test {
    @Test
    public void shouldReturnWhicheverValueIsNearestTo10Or01() {
        Close10 object = new Close10();
        int expected =0;
        int actual = object.close10(10, 10);
        assertEquals(expected,actual);

    }
    @Test
    public void shouldReturnWhicheverValueIsNearestTo102() {
        Close10 object = new Close10();
        int expected =9;
        int actual= object.close10(9, 13);
        assertEquals(expected,actual);
    }
    @Test
    public void shouldReturnWhicheverValueIsNearestTo103() {
        Close10 object = new Close10();
        int expected =0;
        int actual= object.close10(13, 7);
        assertEquals(expected,actual);
    }
    @Test
    public void shouldReturnWhicheverValueIsNearestTo104() {
        Close10 object = new Close10();
        int expected = 5;
        int actual= object.close10(5, 21);
        assertEquals(expected,actual);
    }
}