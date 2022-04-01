package edu.codingbat.warmup2;

import org.junit.Test;

import static org.junit.Assert.*;

public class CountXXTest {
    @Test
    public void shouldReturnCountOfXPairs1() {
        CountXX object = new CountXX();
        int expected =1;
        int actual = object.countXX("abcxx");
        assertEquals(expected,actual);
    }
    @Test
    public void shouldReturnCountOfXPairs2() {
        CountXX object = new CountXX();
        int expected =2;
        int actual = object.countXX("xxx");
        assertEquals(expected,actual);
    }
    @Test
    public void shouldReturnCountOfXPairs3() {
        CountXX object = new CountXX();
        int expected =3;
        int actual = object.countXX("xxxx");
        assertEquals(expected,actual);
    }
    @Test
    public void shouldReturnCountOfXPairs4() {
        CountXX object = new CountXX();
        int expected =2;
        int actual = object.countXX("kittensxxx");
        assertEquals(expected,actual);
    }

}