package edu.codingbat.warmup1;

import org.junit.Test;

import static org.junit.Assert.*;

public class Or35Test {
    @Test
    public void IsMultipleOf3or51() {
        Or35 Object = new Or35();

        assertTrue(Object.or35(3));
    }
    @Test
    public void IsMultipleOf3or52() {
        Or35 Object = new Or35();

        assertFalse(Object.or35(121));
    }
    @Test
    public void IsMultipleOf3or53() {
        Or35 Object = new Or35();

        assertTrue(Object.or35(100));
    }
    @Test
    public void IsMultipleOf3or54() {
        Or35 Object = new Or35();

        assertFalse(Object.or35(29));
    }
}