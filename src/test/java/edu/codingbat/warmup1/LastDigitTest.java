package edu.codingbat.warmup1;

import org.junit.Test;

import static org.junit.Assert.*;

public class LastDigitTest {
    @Test
    public void shouldReturnTrueIfLastDigitInTwoGivenIntAreSam1() {
        LastDigit object = new LastDigit();
        assertTrue(object.lastDigit(10, 0));
    }
    @Test
    public void shouldReturnTrueIfLastDigitInTwoGivenIntAreSame2() {
        LastDigit object = new LastDigit();
        assertTrue(object.lastDigit(114, 4));
    }
    @Test
    public void shouldReturnTrueIfLastDigitInTwoGivenIntAreSame3() {
        LastDigit object = new LastDigit();
        assertFalse(object.lastDigit(11, 0));
    }
    @Test
    public void shouldReturnTrueIfLastDigitInTwoGivenIntAreSame4() {
        LastDigit object = new LastDigit();
        assertFalse(object.lastDigit(11, 0));
    }
}