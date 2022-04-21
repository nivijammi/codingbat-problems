package edu.codingbat.array1;

import org.junit.Test;

import static org.junit.Assert.*;

public class Start1Test {
    @Test
    public void shouldReturnTheCountOfOneIfItsTheFirstElement1() {
        Start1 object = new Start1();
        int[] a = {1,2,3};
        int[] b = {1};
        int expected =2;
        int actual = object.start1(a,b);
    }
    @Test
    public void shouldReturnTheCountOfOneIfItsTheFirstElement2() {
        Start1 object = new Start1();
        int[] a = {1,3};
        int[] b = {1};
        int expected =2;
        int actual = object.start1(a,b);
    }
    @Test
    public void shouldReturnTheCountOfOneIfItsTheFirstElement3() {
        Start1 object = new Start1();
        int[] a = {7};
        int[] b = {8};
        int expected =0;
        int actual = object.start1(a,b);
    }
    @Test
    public void shouldReturnTheCountOfOneIfItsTheFirstElement4() {
        Start1 object = new Start1();
        int[] a = {};
        int[] b = {1,2};
        int expected = 1;
        int actual = object.start1(a,b);
    }
}