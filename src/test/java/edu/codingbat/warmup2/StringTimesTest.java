package edu.codingbat.warmup2;

import org.junit.Test;

import static org.junit.Assert.*;

public class StringTimesTest {
    @Test
    public void shouldReturnNCopiesOfOriginalStr1() {
        StringTimes object = new StringTimes();
        String expected = "codecodecode";
        String actual = object.stringTimes("code", 3);
        assertEquals(expected,actual);
    }
    @Test
    public void shouldReturnNCopiesOfOriginalStr2() {
        StringTimes object = new StringTimes();
        String expected = "";
        String actual = object.stringTimes("", 4);
        assertEquals(expected,actual);

    } @Test
    public void shouldReturnNCopiesOfOriginalStr3() {
        StringTimes object = new StringTimes();
        String expected = "Oh Boy!Oh Boy!";
        String actual = object.stringTimes("Oh Boy!", 2);
        assertEquals(expected,actual);

    } @Test
    public void shouldReturnNCopiesOfOriginalStr4() {
        StringTimes object = new StringTimes();
        String expected = "HiHiHi";
        String actual = object.stringTimes("Hi", 3);
        assertEquals(expected,actual);
    }


}