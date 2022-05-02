package edu.codingbat.array1;

import org.junit.Test;

import static org.junit.Assert.*;

public class FrontPieceTest {
    @Test
    public void shouldReturnANewArrayOfItsFirst2Elements1() {
        FrontPiece object = new FrontPiece();
        int[] nums = {3, 1, 4, 1, 5};
        int[] expected = {3,1};
        int[] actual = object.frontPiece(nums);
    }
    @Test
    public void shouldReturnANewArrayOfItsFirst2Elements2() {
        FrontPiece object = new FrontPiece();
        int[] nums = {};
        int[] expected = {};
        int[] actual = object.frontPiece(nums);
    }
    @Test
    public void shouldReturnANewArrayOfItsFirst2Elements3() {
        FrontPiece object = new FrontPiece();
        int[] nums = {1,2};
        int[] expected = {1,2};
        int[] actual = object.frontPiece(nums);
    }
    @Test
    public void shouldReturnANewArrayOfItsFirst2Elements4() {
        FrontPiece object = new FrontPiece();
        int[] nums = {6};
        int[] expected = {6};
        int[] actual = object.frontPiece(nums);
    }
}