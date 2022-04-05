package edu.codingbat.array1;

import org.junit.Test;

import static org.junit.Assert.*;

public class FirstLast6Test {
    @Test
    public void shouldReturnTrueIf6AppearsFirstOrLast1() {
        FirstLast6 object = new FirstLast6();
        int [] nums ={1,2,3,4};
        assertFalse(object.firstLast6(nums));
    }
    @Test
    public void shouldReturnTrueIf6AppearsFirstOrLast2() {
        FirstLast6 object = new FirstLast6();
        int [] nums ={6};
        assertTrue(object.firstLast6(nums));
    }
    @Test
    public void shouldReturnTrueIf6AppearsFirstOrLast3() {
        FirstLast6 object = new FirstLast6();
        int [] nums ={1,2,3,4,6};
        assertTrue(object.firstLast6(nums));
    }
    @Test
    public void shouldReturnTrueIf6AppearsFirstOrLast4() {
        FirstLast6 object = new FirstLast6();
        int [] nums ={3};
        assertFalse(object.firstLast6(nums));
    }
}