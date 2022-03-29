package edu.codingbat.warmup1;

import org.junit.Test;

import static org.junit.Assert.*;

public class front22Test {
    @Test
    public void shouldReturnTheFirstTwoCharAddedToFrontAndBack1() {
        front22 object = new front22();
        String expected ="kikittenki";
        String actual = object.front22("kitten");
        assertEquals(expected,actual);
    }
    @Test
    public void shouldReturnTheFirstTwoCharAddedToFrontAndBack2() {
        front22 object = new front22();
        String expected ="LoLogicLo";
        String actual = object.front22("Logic");
        assertEquals(expected,actual);
    }
    @Test
    public void shouldReturnTheFirstTwoCharAddedToFrontAndBack3() {
        front22 object = new front22();
        String expected ="aaa";
        String actual = object.front22("a");
        assertEquals(expected,actual);
    }

    @Test
    public void shouldReturnTheFirstTwoCharAddedToFrontAndBack4() {
        front22 object = new front22();
        String expected ="ababcab";
        String actual = object.front22("abc");
        assertEquals(expected,actual);
    }
}