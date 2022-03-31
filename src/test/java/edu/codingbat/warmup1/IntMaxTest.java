package edu.codingbat.warmup1;

import org.junit.Test;

import static org.junit.Assert.*;

public class IntMaxTest {
    @Test
    public void shouldReturnLargestOf3GivenValues1() {
        IntMax object = new IntMax();
        int expected =6;
        int actual = object.intMax(5,3,6);
        assertEquals(expected,actual);
    }
    @Test
    public void shouldReturnLargestOf3GivenValues2() {
        IntMax object = new IntMax();
        int expected = -1;
        int actual = object.intMax(-3, -1, -2);
        assertEquals(expected,actual);
    }
    @Test
    public void shouldReturnLargestOf3GivenValues3() {
        IntMax object = new IntMax();
        int expected =9;
        int actual = object.intMax(3, 3, 9);
        assertEquals(expected,actual);
    }@Test
    public void shouldReturnLargestOf3GivenValues4() {
        IntMax object = new IntMax();
        int expected = 6;
        int actual =object.intMax(5, 6, 2);
        assertEquals(expected,actual);
    }

}