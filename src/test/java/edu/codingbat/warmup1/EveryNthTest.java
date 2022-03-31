package edu.codingbat.warmup1;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class EveryNthTest {
    @Test
    public void shouldReturnEveryNthCharStartingFrom0() {
        EveryNth object = new EveryNth();
        String expected ="Ccas";
        String actual= object.everyNth("Chocolates", 3);
        assertEquals(expected,actual);
    }
    @Test
    public void shouldReturnEveryNthCharStartingFrom01() {
        EveryNth object = new EveryNth();
        String expected = "C";
        String actual= object.everyNth("Chocolates", 100);
        assertEquals(expected,actual);
    }
    @Test
    public void shouldReturnEveryNthCharStartingFrom02() {
        EveryNth object = new EveryNth();
        String expected ="adg";
        String actual= object.everyNth("abcdefg", 3);
        assertEquals(expected,actual);
    }
    @Test
    public void shouldReturnEveryNthCharStartingFrom03() {
        EveryNth object = new EveryNth();
        String expected = "Mrce";
        String actual= object.everyNth("Miracle", 2);
        assertEquals(expected,actual);
    }

}