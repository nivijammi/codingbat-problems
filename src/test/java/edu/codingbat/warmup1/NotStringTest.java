package edu.codingbat.warmup1;

import org.junit.Test;

import static org.junit.Assert.*;

public class NotStringTest {
    @Test
    public void shouldReturnWithNotAdded1() {
        NotString object = new NotString();
        String expected = "not candy";
        String actual = object.notString("candy");
        assertEquals("this will have not added to it",expected,actual);
    }
    @Test
    public void shouldReturnWithNotAdded2() {
        NotString object = new NotString();
        String expected = "not";
        String actual = object.notString("not");
        assertEquals("this will have not added to it",expected,actual);
    }
    @Test
    public void shouldReturnWithNotAdded3() {
        NotString object = new NotString();
        String expected = "not is not";
        String actual = object.notString("is not");
        assertEquals("this will have not added to it",expected,actual);
    }
    @Test
    public void shouldReturnWithNotAdded4() {
        NotString object = new NotString();
        String expected = "not no";
        String actual = object.notString("no");
        assertEquals("this will have not added to it",expected,actual);
    }
    @Test
    public void shouldReturnWithNotAdded5() {
        NotString object = new NotString();
        String expected = "not bad";
        String actual = object.notString("not bad");
        assertEquals("this will have not added to it",expected,actual);
    }
    @Test
    public void shouldReturnWithNotAdded6() {
        NotString object = new NotString();
        String expected = "not x";
        String actual = object.notString("x");
        assertEquals("this will have not added to it",expected,actual);
    }

}