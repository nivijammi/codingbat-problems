package edu.codingbat.warmup1;

import org.junit.Test;

import static org.junit.Assert.*;

public class Diff21Test {
    @Test
    public void shouldReturnDoubleIfDiffOrDiff() {
        Diff21 object = new Diff21();
        int expected = 2;
        int actual = object.diff21(19);
        assertEquals("diff b/w 21 and n ", expected, actual);
    }

    @Test
    public void shouldReturnDoubleIfDiffOrDiff1() {
        Diff21 object = new Diff21();
        int expected = 11;
        int actual = object.diff21(11);
        assertEquals("diff b/w 21 and n ", expected, actual);

    }

    @Test
    public void shouldReturnDoubleIfDiffOrDiff2() {
        Diff21 object = new Diff21();
        int expected = 23;
        int actual = object.diff21(-2);
        assertEquals("n over 21 or same as 21 returns double", expected, actual);

    }
}