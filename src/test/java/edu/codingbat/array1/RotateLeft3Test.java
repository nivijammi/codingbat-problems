package edu.codingbat.array1;

import org.junit.Test;

import static org.junit.Assert.*;

public class RotateLeft3Test {
    @Test
    public void shouldReturnWithElementsRotatedLeft1() {
        RotateLeft3 object = new RotateLeft3();
        int[] nums = {1,2,3};
        int [] expected ={2,3,1};
        int[] actual = object.rotateLeft3(nums);
    }
    @Test
    public void shouldReturnWithElementsRotatedLeft2() {
        RotateLeft3 object = new RotateLeft3();
        int[] nums = {5,11,9};
        int [] expected ={11,9,5};
        int[] actual = object.rotateLeft3(nums);
    }
    @Test
    public void shouldReturnWithElementsRotatedLeft3() {
        RotateLeft3 object = new RotateLeft3();
        int[] nums = {7,0,0};
        int [] expected ={0,0,7};
        int[] actual = object.rotateLeft3(nums);
    }
    @Test
    public void shouldReturnWithElementsRotatedLeft4() {
        RotateLeft3 object = new RotateLeft3();
        int[] nums = {1,2,1};
        int [] expected ={2,1,1};
        int[] actual = object.rotateLeft3(nums);
    }
    @Test
    public void shouldReturnWithElementsRotatedLeft5() {
        RotateLeft3 object = new RotateLeft3();
        int[] nums = {0,0,1};
        int [] expected ={0,1,0};
        int[] actual = object.rotateLeft3(nums);
    }




}