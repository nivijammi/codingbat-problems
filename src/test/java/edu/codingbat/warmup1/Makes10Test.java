package edu.codingbat.warmup1;

import org.junit.Test;

import static org.junit.Assert.*;

public class Makes10Test {
    @Test
    public void shouldReturn10IfSum10OrOneIs10() {
        Makes10 object = new Makes10();
        assertTrue("one parameter is 10", object.makes10(9,10));
    }
    @Test
    public void shouldReturn10IfSum10OrOneIs101() {
        Makes10 object = new Makes10();
        assertFalse("one parameter is 10", object.makes10(8,3));
    }
    @Test
    public void shouldReturn10IfSum10OrOneIs102() {
        Makes10 object = new Makes10();
        assertTrue("one parameter is 10", object.makes10(12,-2));
    }
}