package edu.codingbat.warmup1;

import org.junit.Test;

import static org.junit.Assert.*;

public class StartHiTest {
    @Test
    public void shouldReturnTrueIfStrStartsWithHi() {
        StartHi object = new StartHi();
        assertTrue(object.startHi("hi there"));
    }
    @Test
    public void shouldReturnTrueIfStrStartsWithHi1() {
        StartHi object = new StartHi();
        assertTrue(object.startHi("hi ho"));
    }
    @Test
    public void shouldReturnTrueIfStrStartsWithHi2() {
        StartHi object = new StartHi();
        assertFalse(object.startHi("h"));
    }
    @Test
    public void shouldReturnTrueIfStrStartsWithHi3() {
        StartHi object = new StartHi();
        assertFalse(object.startHi("he"));
    }

}