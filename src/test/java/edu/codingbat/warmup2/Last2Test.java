package edu.codingbat.warmup2;

import org.junit.Test;

import static org.junit.Assert.*;

public class Last2Test {
    @Test
    public void shouldReturnCountWhenSubstringOfTwoMatchesLast2Chars1() {
        Last2 object = new Last2();
        int expected = 2;
        int actual = object.last2("1717171");
        assertEquals(expected,actual);
    }
    @Test
    public void shouldReturnCountWhenSubstringOfTwoMatchesLast2Chars2() {
        Last2 object = new Last2();
        int expected = 0;
        int actual = object.last2("xaxaxaxx");
        assertEquals(expected,actual);
    }
    @Test
    public void shouldReturnCountWhenSubstringOfTwoMatchesLast2Chars3() {
        Last2 object = new Last2();
        int expected = 0;
        int actual = object.last2("hi");
        assertEquals(expected,actual);
    }
    @Test
    public void shouldReturnCountWhenSubstringOfTwoMatchesLast2Chars4() {
        Last2 object = new Last2();
        int expected = 3;
        int actual = object.last2("xxaxxaxxaxx");
        assertEquals(expected,actual);
    }
}