package edu.codingbat.warmup1;

import org.junit.Test;

import static org.junit.Assert.*;

public class MissingCharTest {
    @Test
    public void shouldRemoveCharAtNthIndex1() {
        MissingChar object = new MissingChar();
        String expected = "kittn";
        String actual = object.missingChar("kitten",4);
        assertEquals("the char at 4th index is removed",expected,actual );
    }
    @Test
    public void shouldRemoveCharAtNthIndex2() {
        MissingChar object = new MissingChar();
        String expected = "i";
        String actual = object.missingChar("Hi",0);
        assertEquals("the char at 0th index is removed",expected,actual );
    }
    @Test
    public void shouldRemoveCharAtNthIndex3() {
        MissingChar object = new MissingChar();
        String expected = "ode";
        String actual = object.missingChar("code",0);
        assertEquals("the char at 0th index is removed",expected,actual);
    }
    @Test
    public void shouldRemoveCharAtNthIndex4() {
        MissingChar object = new MissingChar();
        String expected = "cde";
        String actual = object.missingChar("code",1);
        assertEquals("the char at 1st index is removed",expected,actual );
    }
    @Test
    public void shouldRemoveCharAtNthIndex5() {
        MissingChar object = new MissingChar();
        String expected = "cod";
        String actual = object.missingChar("code",3);
        assertEquals("the char at 3rd index is removed",expected,actual );
    }
    @Test
    public void shouldRemoveCharAtNthIndex6() {
        MissingChar object = new MissingChar();
        String expected = "chocolat";
        String actual = object.missingChar("chocolate", 8);
        assertEquals("the char at 8th index is removed",expected,actual);
    }
}