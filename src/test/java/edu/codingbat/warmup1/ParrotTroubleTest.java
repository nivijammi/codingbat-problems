package edu.codingbat.warmup1;

import org.junit.Test;

import static org.junit.Assert.*;

public class ParrotTroubleTest {
    @Test
    public void shouldReturnTrueIfInTrouble() {
        ParrotTrouble pt = new ParrotTrouble();
        assertTrue(pt.parrotTrouble( true,6));
    }
    @Test
    public void shouldReturnTrueIfInTrouble1() {
        ParrotTrouble pt = new ParrotTrouble();
        assertFalse(pt.parrotTrouble( true,7));
    }
    @Test
    public void shouldReturnTrueIfInTrouble2() {
        ParrotTrouble pt = new ParrotTrouble();
        assertFalse(pt.parrotTrouble( false,6));
    }
}