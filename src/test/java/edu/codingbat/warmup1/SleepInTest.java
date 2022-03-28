package edu.codingbat.warmup1;

import org.junit.Test;

import static org.junit.Assert.*;

public class SleepInTest {
    @Test
    public void sleepTime() {
        SleepIn sleep = new SleepIn();
        boolean expected = true;

        assertTrue(sleep.sleepIn(false, false));
    }
    @Test
    public void sleepTime1() {
        SleepIn sleep = new SleepIn();
        boolean expected = false;

        assertFalse(sleep.sleepIn(true, false));
    }
    @Test
    public void sleepTime2() {
        SleepIn sleep = new SleepIn();
        boolean expected = true;

        assertTrue(sleep.sleepIn(false, false));
    }
}