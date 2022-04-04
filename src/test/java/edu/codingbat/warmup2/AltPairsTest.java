package edu.codingbat.warmup2;

import org.junit.Test;

import static org.junit.Assert.*;

public class AltPairsTest {
    @Test
    public void shouldReturnAStringOfCharsAtIndexes014589One() {
        AltPairs object = new AltPairs();
        String expected ="ThThThth";
        String actual = object.altPairs("ThisThatTheOther");
        assertEquals(expected,actual);
    }
    @Test
    public void shouldReturnAStringOfCharsAtIndexes014589Two() {
        AltPairs object = new AltPairs();
        String expected ="y";
        String actual = object.altPairs("y");
        assertEquals(expected,actual);
    }
    @Test
    public void shouldReturnAStringOfCharsAtIndexes014589Three() {
        AltPairs object = new AltPairs();
        String expected ="ya";
        String actual = object.altPairs("yak");
        assertEquals(expected,actual);
    }
    @Test
    public void shouldReturnAStringOfCharsAtIndexes014589Four() {
        AltPairs object = new AltPairs();
        String expected ="Chole";
        String actual = object.altPairs("Chocolate");
        assertEquals(expected,actual);
    }
}