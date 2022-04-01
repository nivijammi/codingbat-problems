package edu.codingbat.warmup2;

import org.junit.Test;

import static org.junit.Assert.*;

public class StringBitsTest {
    @Test
    public void shouldReturnANewStringWitheEveryOtherChar1() {
        StringBits object = new StringBits();
        String expected = "Hello";
        String actual = object.stringBits("Heeololeo");
        assertEquals(expected,actual);
    }

    @Test
    public void shouldReturnANewStringWitheEveryOtherChar2() {
        StringBits object = new StringBits();
        String expected = "Getns";
        String actual = object.stringBits("Greetings");
        assertEquals(expected,actual);
    }

    @Test
    public void shouldReturnANewStringWitheEveryOtherChar3() {
        StringBits object = new StringBits();
        String expected = "HloKte";
        String actual = object.stringBits("Hello Kitten");
        assertEquals(expected,actual);
    }

    @Test
    public void shouldReturnANewStringWitheEveryOtherChar4() {
        StringBits object = new StringBits();
        String expected = "happy";
        String actual = object.stringBits("hxaxpxpxy");
        assertEquals(expected,actual);
    }

}