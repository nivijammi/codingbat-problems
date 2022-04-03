package edu.codingbat.warmup2;

import org.junit.Test;

import static org.junit.Assert.*;

public class Array123Test {
    @Test
    public void shouldReturnTrueIfSequence123AppearsInTheArraySomewhere1() {
        Array123 object = new Array123();
        int [] nums ={1, 1, 2, 1, 2, 1};
        assertFalse(object.array123(nums));
    }
    @Test
    public void shouldReturnTrueIfSequence123AppearsInTheArraySomewhere2() {
        Array123 object = new Array123();
        int [] nums ={1, 2};
        assertFalse(object.array123(nums));
    }
    @Test
    public void shouldReturnTrueIfSequence123AppearsInTheArraySomewhere3() {
        Array123 object = new Array123();
        int [] nums ={1, 2,3};
        assertTrue(object.array123(nums));
    }
    @Test
    public void shouldReturnTrueIfSequence123AppearsInTheArraySomewhere4() {
        Array123 object = new Array123();
        int [] nums ={1, 1, 2, 1, 2, 3};
        assertTrue(object.array123(nums));
    }

}