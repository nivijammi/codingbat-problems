package edu.codingbat.warmup2;

import org.junit.Test;

import static org.junit.Assert.*;

public class StringMatchTest {
    @Test
    public void shouldReturnNoOfPositionsWhereStringAandBContainSameLength2Substring0() {
        StringMatch object = new StringMatch();
        int expected = 3;
        int actual = object.stringMatch("xxcaazz", "xxbaaz");
        assertEquals(expected,actual);
    }
    @Test
    public void shouldReturnNoOfPositionsWhereStringAandBContainSameLength2Substring1() {
        StringMatch object = new StringMatch();
        int expected = 1;
        int actual = object.stringMatch("aabbccdd", "abbbxxd");
        assertEquals(expected,actual);
    }
    @Test
    public void shouldReturnNoOfPositionsWhereStringAandBContainSameLength2Substring2() {
        StringMatch object = new StringMatch();
        int expected = 0;
        int actual = object.stringMatch("", "hello");
        assertEquals(expected,actual);
    }
    @Test
    public void shouldReturnNoOfPositionsWhereStringAandBContainSameLength2Substring3() {
        StringMatch object = new StringMatch();
        int expected = 1;
        int actual = object.stringMatch("he", "hello");
        assertEquals(expected,actual);
    }
}
