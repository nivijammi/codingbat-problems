package edu.codingbat.warmup2;

import org.junit.Test;

import static org.junit.Assert.*;

public class StringSplosionTest {
    @Test
    public void ShouldReturnAStringLikeCodeIntoCCoCodCode() {
        StringSplosion object = new StringSplosion();
        String expected = "CCoCodCode";
        String actual = object.stringSplosion("Code");

        assertEquals(expected, actual);
    }
    @Test
    public void ShouldReturnAStringLikeCodeIntoCCoCodCode1() {
        StringSplosion object = new StringSplosion();
        String expected = "x";
        String actual = object.stringSplosion("x");

        assertEquals(expected, actual);
    }
    @Test
    public void ShouldReturnAStringLikeCodeIntoCCoCodCode2() {
        StringSplosion object = new StringSplosion();
        String expected = "TThTheTherThere";
        String actual = object.stringSplosion("There");

        assertEquals(expected, actual);
    }
    @Test
    public void ShouldReturnAStringLikeCodeIntoCCoCodCode3() {
        StringSplosion object = new StringSplosion();
        String expected = "KKiKitKittKitteKitten";
        String actual = object.stringSplosion("Kitten");

        assertEquals(expected, actual);
    }
    @Test
    public void ShouldReturnAStringLikeCodeIntoCCoCodCode4() {
        StringSplosion object = new StringSplosion();
        String expected = "BBaBad";
        String actual = object.stringSplosion("Bad");

        assertEquals(expected, actual);
    }

}