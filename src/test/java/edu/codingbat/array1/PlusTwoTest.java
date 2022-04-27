package edu.codingbat.array1;

import org.junit.Test;

import static org.junit.Assert.*;

public class PlusTwoTest {
    @Test
    public void shouldReturnNewArrayWithElementsFromBothArrays1() {
        PlusTwo object = new PlusTwo();
        int[] a = {1,2};
        int[] b = {3,4};
        int[] expected = {1,2,3,4};
        int[] actual = object.plusTwo(a,b);
    }
    @Test
    public void shouldReturnNewArrayWithElementsFromBothArrays2() {
        PlusTwo object = new PlusTwo();
        int[] a = {4,4};
        int[] b = {2,2};
        int[] expected = {4,4,2,2};
        int[] actual = object.plusTwo(a,b);
    }
    @Test
    public void shouldReturnNewArrayWithElementsFromBothArrays3() {
        PlusTwo object = new PlusTwo();
        int[] a = {9,2};
        int[] b = {3,4};
        int[] expected = {9,2,3,4};
        int[] actual = object.plusTwo(a,b);
    }
}