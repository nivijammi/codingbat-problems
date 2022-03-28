package edu.codingbat.warmup1;

import org.junit.Test;

import static org.junit.Assert.*;

public class SumDoubleTest {
    @Test
    public void shouldReturnDoubleIfSame() {
        SumDouble sd = new SumDouble();
        int expected = 3;
        int actual = sd.sumDouble(1,2);
        assertEquals("returns sum as int values not same",expected,actual);
    }
    @Test
    public void shouldReturnDoubleIfSame2() {
        SumDouble sd = new SumDouble();
        int expected = 5;
        int actual = sd.sumDouble(3,2);
        assertEquals("returns sum as int values not same",expected,actual);
    }
    @Test
    public void shouldReturnDoubleIfSame3() {
        SumDouble sd = new SumDouble();
        int expected = 8;
        int actual = sd.sumDouble(2,2);
        assertEquals("returns double as int values not same",expected,actual);
    }
}