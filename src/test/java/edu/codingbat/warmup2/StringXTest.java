package edu.codingbat.warmup2;

import org.junit.Test;

import static org.junit.Assert.*;

public class StringXTest {
    @Test
    public void shouldRemoveAllXsFromStrExceptTheFirstAndLast1() {
        StringX object = new StringX();
        String expected ="x" ;
        String actual =object.stringX("x");
        assertEquals(expected,actual);
    }
    @Test
    public void shouldRemoveAllXsFromStrExceptTheFirstAndLast2() {
        StringX object = new StringX();
        String expected = "xHix";
        String actual =object.stringX("xxHxix");
        assertEquals(expected,actual);
    }
    @Test
    public void shouldRemoveAllXsFromStrExceptTheFirstAndLast3() {
        StringX object = new StringX();
        String expected ="xabcdx";
        String actual =object.stringX("xabxxxcdx");
        assertEquals(expected,actual);
    }
    @Test
    public void shouldRemoveAllXsFromStrExceptTheFirstAndLast4() {
        StringX object = new StringX();
        String expected = "xx";
        String actual =object.stringX("xx");
        assertEquals(expected,actual);
    }
}