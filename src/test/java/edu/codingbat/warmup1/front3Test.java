package edu.codingbat.warmup1;

import org.junit.Test;

import static org.junit.Assert.*;

public class front3Test {
    @Test
    public void shouldReturnFirst3CharOrThreeTimesStr() {
        front3 object = new front3();
        String expected = "javjavjav";
        String actual = object.front3("java");
        assertEquals(expected,actual);
    }
    @Test
    public void shouldReturnFirst3CharOrThreeTimesStr1() {
        front3 object = new front3();
        String expected = "";
        String actual = object.front3("");
        assertEquals(expected,actual);
    }
    @Test
    public void shouldReturnFirst3CharOrThreeTimesStr2() {
        front3 object = new front3();
        String expected = "aaa";
        String actual = object.front3("a");
        assertEquals(expected,actual);
    }
    @Test
    public void shouldReturnFirst3CharOrThreeTimesStr3() {
        front3 object = new front3();
        String expected = "ababab";
        String actual = object.front3("ab");
        assertEquals(expected,actual);
    }
    @Test
    public void shouldReturnFirst3CharOrThreeTimesStr4() {
        front3 object = new front3();
        String expected = "ChoChoCho";
        String actual = object.front3("Chocolate");
        assertEquals(expected,actual);
    }
}