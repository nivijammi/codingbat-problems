package edu.codingbat.warmup1;

import org.junit.Test;

import static org.junit.Assert.*;

public class MixStartTest {
    @Test
    public void shouldReturnTrueIfStringStartsWithMixExceptMCanBeAnything1() {
        MixStart object = new MixStart();
        assertTrue(object.mixStart("nix"));
    }
    @Test
    public void shouldReturnTrueIfStringStartsWithMixExceptMCanBeAnything2() {
        MixStart object = new MixStart();
        assertTrue(object.mixStart("pix snacks"));
    }
    @Test
    public void shouldReturnTrueIfStringStartsWithMixExceptMCanBeAnything3() {
        MixStart object = new MixStart();
        assertFalse(object.mixStart("n"));
    }
    @Test
    public void shouldReturnTrueIfStringStartsWithMixExceptMCanBeAnything4() {
        MixStart object = new MixStart();
        assertFalse(object.mixStart(""));
    }
}