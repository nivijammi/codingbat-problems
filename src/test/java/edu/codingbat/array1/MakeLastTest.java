package edu.codingbat.array1;

import org.junit.Test;

import static org.junit.Assert.*;

public class MakeLastTest {
    @Test
    public void shouldReturnNewArrayWithDoubleTheLength1() {
        MakeLast object = new MakeLast();
        int [] nums= {2,4};
        int [] expected = {0,0,0,4};
        int [] actual = object.makeLast(nums);
    }
    @Test
    public void shouldReturnNewArrayWithDoubleTheLength2() {
        MakeLast object = new MakeLast();
        int [] nums= {7,7,7};
        int [] expected = {0,0,0,0,0,7};
        int [] actual = object.makeLast(nums);
    }
    @Test
    public void shouldReturnNewArrayWithDoubleTheLength3() {
        MakeLast object = new MakeLast();
        int [] nums= {1,2,3,4};
        int [] expected = {0,0,0,0,0,0,0,4};
        int [] actual = object.makeLast(nums);
    }
    @Test
    public void shouldReturnNewArrayWithDoubleTheLength4() {
        MakeLast object = new MakeLast();
        int [] nums= {0};
        int [] expected = {0,0};
        int [] actual = object.makeLast(nums);
    }
}