package edu.codingbat.warmup1;

import org.junit.Test;

import static org.junit.Assert.*;

public class BackAroundTest {
    @Test
    public void shouldAddLastCharToFrontAndBack1() {
        BackAround object = new BackAround();
        String expected = "obooo";
        String actual = object.backAround("boo");
        assertEquals(expected, actual);

    }
    @Test
    public void shouldAddLastCharToFrontAndBack2() {
        BackAround object = new BackAround();
        String expected = "cabcc";
        String actual = object.backAround("abc");
        assertEquals(expected, actual);

    }
    @Test
    public void shouldAddLastCharToFrontAndBack3() {
        BackAround object = new BackAround();
        String expected = "aaa";
        String actual = object.backAround("a");
        assertEquals(expected, actual);

    }
    @Test
    public void shouldAddLastCharToFrontAndBack4() {
        BackAround object = new BackAround();
        String expected = "dreadd";
        String actual = object.backAround("read");
        assertEquals(expected, actual);

    }

}