package edu.codingbat.warmup2;

import org.junit.Test;

import static org.junit.Assert.*;

public class Has271Test {
    @Test
    public void shouldReturnTrueIfContains271PatternValPluS5ValMinus1One() {
        Has271 object = new Has271();
        int nums[] = {1, 1, 4, 9, 4, 9, 2};
        assertTrue(object.has271(nums));
    }
    @Test
    public void shouldReturnTrueIfContains271PatternValPluS5ValMinus1Two() {
        Has271 object = new Has271();
        int nums[] = {2, 7, -2, 4, 10, 2};
        assertFalse(object.has271(nums));
    }
    @Test
    public void shouldReturnTrueIfContains271PatternValPluS5ValMinus1Three() {
        Has271 object = new Has271();
        int nums[] = {2, 7, -1};
        assertTrue(object.has271(nums));
    }
    @Test
    public void shouldReturnTrueIfContains271PatternValPluS5ValMinus1Four() {
        Has271 object = new Has271();
        int nums[] = {2, 7, -2};
        assertFalse(object.has271(nums));
    }

}