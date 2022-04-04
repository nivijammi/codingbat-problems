package edu.codingbat.warmup2;

import org.junit.Test;

import static org.junit.Assert.*;

public class NoTriplesTest {
    @Test
    public void shouldReturnFalseIfTripleValAppearsThreeTimesInARow1() {
        NoTriples object = new NoTriples();
        int nums[] = {1};
        assertTrue(object.noTriples(nums));
    }
    @Test
    public void shouldReturnFalseIfTripleValAppearsThreeTimesInARow2() {
        NoTriples object = new NoTriples();
        int nums[] = {1,1,1};
        assertFalse(object.noTriples(nums));
    }
    @Test
    public void shouldReturnFalseIfTripleValAppearsThreeTimesInARow3() {
        NoTriples object = new NoTriples();
        int nums[] = {1, 1, 2, 2, 1, 2, 1};
        assertTrue(object.noTriples(nums));
    }
    @Test
    public void shouldReturnFalseIfTripleValAppearsThreeTimesInARow4() {
        NoTriples object = new NoTriples();
        int nums[] = {1, 1, 2, 2, 2, 1};
        assertFalse(object.noTriples(nums));
    }
}