package edu.codingbat.warmup1;

import org.junit.Test;

import static org.junit.Assert.*;

public class DelDelTest {
    @Test
    public void shouldReturnStringWithDelDeletedIAppearsAt1stIndex1() {
        DelDel object = new DelDel();
        String expected ="aHello";
        String actual = object.delDel("adelHello");
        assertEquals(expected,actual);
    }
    @Test
    public void shouldReturnStringWithDelDeletedIAppearsAt1stIndex2() {
        DelDel object = new DelDel();
        String expected = "add";
        String actual = object.delDel("add");
        assertEquals(expected,actual);
    }
    @Test
    public void shouldReturnStringWithDelDeletedIAppearsAt1stIndex3() {
        DelDel object = new DelDel();
        String expected ="a";
        String actual = object.delDel("adel");
        assertEquals(expected,actual);
    }
    @Test
    public void shouldReturnStringWithDelDeletedIAppearsAt1stIndex4() {
        DelDel object = new DelDel();
        String expected = "aadelbb";
        String actual = object.delDel("aadelbb");
        assertEquals(expected,actual);
    }

}