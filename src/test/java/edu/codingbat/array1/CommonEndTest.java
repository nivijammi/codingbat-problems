package edu.codingbat.array1;

import org.junit.Test;

import static org.junit.Assert.*;

public class CommonEndTest {
    @Test
    public void shouldReturnTrueIfTwoGivenArraysHaveSameFirstOrLastElements1() {
        CommonEnd object = new CommonEnd();
        int [] a = {1,2,3};
        int [] b = {7,3};
        assertTrue(object.commonEnd(a,b));
    }
    @Test
    public void shouldReturnTrueIfTwoGivenArraysHaveSameFirstOrLastElements2() {
        CommonEnd object = new CommonEnd();
        int [] a = {1,2,3};
        int [] b = {7,3,2};
        assertFalse(object.commonEnd(a,b));
    }
    @Test
    public void shouldReturnTrueIfTwoGivenArraysHaveSameFirstOrLastElements3() {
        CommonEnd object = new CommonEnd();
        int [] a = {1,2,3};
        int [] b = {1,3};
        assertTrue(object.commonEnd(a,b));
    }
    @Test
    public void shouldReturnTrueIfTwoGivenArraysHaveSameFirstOrLastElements4() {
        CommonEnd object = new CommonEnd();
        int [] a = {1,2,3};
        int [] b = {1};
        assertTrue(object.commonEnd(a,b));
    }
    @Test
    public void shouldReturnTrueIfTwoGivenArraysHaveSameFirstOrLastElements5() {
        CommonEnd object = new CommonEnd();
        int [] a = {1,2,3};
        int [] b = {2};
        assertFalse(object.commonEnd(a,b));
    }
}
