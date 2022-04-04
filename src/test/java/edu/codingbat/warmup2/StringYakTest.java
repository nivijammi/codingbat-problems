package edu.codingbat.warmup2;

import org.junit.Test;

import static org.junit.Assert.*;

public class StringYakTest {
    @Test
    public void shouldReturnAStrWhereAllTheYakAreRemoved1() {
        StringYak object = new StringYak();
        String expected = "pak";
        String actual = object.stringYak("yakpak");
        assertEquals(expected,actual);

    }
    @Test
    public void shouldReturnAStrWhereAllTheYakAreRemoved2() {
        StringYak object = new StringYak();
        String expected = "pak";
        String actual = object.stringYak("pakyak");
        assertEquals(expected,actual);

    }
    @Test
    public void shouldReturnAStrWhereAllTheYakAreRemoved3() {
        StringYak object = new StringYak();
        String expected = "xxxyyzzz";
        String actual = object.stringYak("xxxyakyyyakzzz");
        assertEquals(expected,actual);

    }
    @Test
    public void shouldReturnAStrWhereAllTheYakAreRemoved4() {
        StringYak object = new StringYak();
        String expected = "";
        String actual = object.stringYak("yak");
        assertEquals(expected,actual);

    }

}