package edu.codingbat.array1;

import org.junit.Test;

import static org.junit.Assert.*;

public class MiddleWayTest {
    @Test
    public void shouldReturnANewArrayLength2ContainingTheirMiddleElements1() {
        MiddleWay object = new MiddleWay();
        int[]a ={1,2,3};
        int[] b = {4,5,6};
        int[] expected = {2,5};
        int [] actual = object.middleWay(a,b);
    }
    @Test
    public void shouldReturnANewArrayLength2ContainingTheirMiddleElements2() {
        MiddleWay object = new MiddleWay();
        int[]a ={7,7,7};
        int[] b = {3,8,0};
        int[] expected = {7,8};
        int [] actual = object.middleWay(a,b);
    }
    @Test
    public void shouldReturnANewArrayLength2ContainingTheirMiddleElements3() {
        MiddleWay object = new MiddleWay();
        int[]a ={5,2,9};
        int[] b = {1,4,5};
        int[] expected = {2,4};
        int [] actual = object.middleWay(a,b);
    }
    @Test
    public void shouldReturnANewArrayLength2ContainingTheirMiddleElements4() {
        MiddleWay object = new MiddleWay();
        int[]a ={1,9,7};
        int[] b = {4,8,8};
        int[] expected = {9,8};
        int [] actual = object.middleWay(a,b);
    }
    @Test
    public void shouldReturnANewArrayLength2ContainingTheirMiddleElements5() {
        MiddleWay object = new MiddleWay();
        int[]a ={1,2,3};
        int[] b = {3,1,4};
        int[] expected = {2,1};
        int [] actual = object.middleWay(a,b);
    }
    @Test
    public void shouldReturnANewArrayLength2ContainingTheirMiddleElements6() {
        MiddleWay object = new MiddleWay();
        int[]a ={1,2,3};
        int[] b = {4,1,1};
        int[] expected = {2,1};
        int [] actual = object.middleWay(a,b);
    }
}