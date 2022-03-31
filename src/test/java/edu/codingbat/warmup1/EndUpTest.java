package edu.codingbat.warmup1;

import org.junit.Test;

import static org.junit.Assert.*;

public class EndUpTest {
    @Test
    public void shouldReturnStringWithLast3CharUpperCaseIfLengthMoreThanThree1() {
        EndUp object = new EndUp();
        String expected = "HI";
        String actual = object.endUp("hi");
        assertEquals(expected,actual);
    }
    @Test
    public void shouldReturnStringWithLast3CharUpperCaseIfLengthMoreThanThree2() {
        EndUp object = new EndUp();
        String expected = "X";
        String actual = object.endUp("x");
        assertEquals(expected,actual);
    }
    @Test
    public void shouldReturnStringWithLast3CharUpperCaseIfLengthMoreThanThree3() {
        EndUp object = new EndUp();
        String expected = "hi thERE";
        String actual = object.endUp("hi there");
        assertEquals(expected,actual);
    }
    @Test
    public void shouldReturnStringWithLast3CharUpperCaseIfLengthMoreThanThree4() {
        EndUp object = new EndUp();
        String expected = "woo HOO";
        String actual = object.endUp("woo hoo");
        assertEquals(expected,actual);
    }

}