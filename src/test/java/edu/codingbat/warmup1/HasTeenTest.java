package edu.codingbat.warmup1;

import org.junit.Test;

import static org.junit.Assert.*;

public class HasTeenTest {
    @Test
    public void shouldReturnTrueIfThreeValuesAreBetween13And19Inclusive1() {
        HasTeen object = new HasTeen();
        assertFalse(object.hasTeen(4,2,20));
    }
    @Test
    public void shouldReturnTrueIfThreeValuesAreBetween13And19Inclusive2() {
        HasTeen object = new HasTeen();
        assertFalse(object.hasTeen(12, 9, 20));
    }
    @Test
    public void shouldReturnTrueIfThreeValuesAreBetween13And19Inclusive3() {
        HasTeen object = new HasTeen();
        assertTrue(object.hasTeen(20, 10, 13));
    }
    @Test
    public void shouldReturnTrueIfThreeValuesAreBetween13And19Inclusive4() {
        HasTeen object = new HasTeen();
        assertTrue(object.hasTeen(12, 20, 19));

    }
}