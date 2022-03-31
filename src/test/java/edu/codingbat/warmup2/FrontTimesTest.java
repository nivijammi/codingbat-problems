package edu.codingbat.warmup2;

import org.junit.Test;

import static org.junit.Assert.*;

public class FrontTimesTest {
    @Test
    public void shouldReturnNCharNTimesOfAGivenString1(){
        FrontTimes object = new FrontTimes();
        String expected = "AAAA";
        String actual = object.frontTimes("A", 4);
        assertEquals(expected,actual);

    }
    @Test
    public void shouldReturnNCharNTimesOfAGivenString2(){
        FrontTimes object = new FrontTimes();
        String expected = "";
        String actual = object.frontTimes("Abc", 0);
        assertEquals(expected,actual);

    }
    @Test
    public void shouldReturnNCharNTimesOfAGivenString3(){
        FrontTimes object = new FrontTimes();
        String expected = "AbcAbcAbc";
        String actual = object.frontTimes("Abc", 3);
        assertEquals(expected,actual);

    }
    @Test
    public void shouldReturnNCharNTimesOfAGivenString4(){
        FrontTimes object = new FrontTimes();
        String expected = "ChoCho";
        String actual = object.frontTimes("Chocolate", 2);
        assertEquals(expected,actual);

    }
}