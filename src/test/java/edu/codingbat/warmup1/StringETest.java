package edu.codingbat.warmup1;

import org.junit.Test;

import static org.junit.Assert.*;

public class StringETest {
    @Test
    public void shouldReturnTrueStringContainsBetween1And3eChars1() {
        StringE object = new StringE();
        assertTrue(object.stringE("e"));
    }
    @Test
    public void shouldReturnTrueStringContainsBetween1And3eChars2() {
        StringE object = new StringE();
        assertFalse(object.stringE("Heelele"));
    }
    @Test
    public void shouldReturnTrueStringContainsBetween1And3eChars3() {
        StringE object = new StringE();
        assertTrue(object.stringE("Heelle"));
    }
    @Test
    public void shouldReturnTrueStringContainsBetween1And3eChars4() {
        StringE object = new StringE();
        assertFalse(object.stringE(""));
    }

}