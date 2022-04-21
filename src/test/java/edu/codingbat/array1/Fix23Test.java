package edu.codingbat.array1;

import org.junit.Test;

import static org.junit.Assert.*;

public class Fix23Test {
    @Test
    public void shouldReturn0if2isFollowedBy3One() {
        Fix23 object = new Fix23();
        int [] nums = {1,2,3};
        int[] expected = {1,2,0};
        int[] actual = object.fix23(nums);
    }
    @Test
    public void shouldReturn0if2isFollowedBy3Two() {
        Fix23 object = new Fix23();
        int [] nums = {2,3,3};
        int[] expected = {2,0,3};
        int[] actual = object.fix23(nums);
    }
    @Test
    public void shouldReturn0if2isFollowedBy3Three() {
        Fix23 object = new Fix23();
        int [] nums = {3,2,1};
        int[] expected = {3,2,1};
        int[] actual = object.fix23(nums);
    }
    @Test
    public void shouldReturn0if2isFollowedBy3Four() {
        Fix23 object = new Fix23();
        int [] nums = {2,3,5};
        int[] expected = {2,0,5};
        int[] actual = object.fix23(nums);
    }


}