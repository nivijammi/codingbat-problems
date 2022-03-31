package edu.codingbat.warmup1;

import org.junit.Test;

import static org.junit.Assert.*;

public class Max1020Test {
    @Test
    public void shouldReturnTheLargerValueInRangeOf10To20InclusiveOrReturn01() {
        Max1020 object = new Max1020();
        int expected = 17;
        int actual = object.max1020(17, 16);
        assertEquals(expected,actual);
    }
    @Test
    public void shouldReturnTheLargerValueInRangeOf10To20InclusiveOrReturn02() {
        Max1020 object = new Max1020();
        int expected = 20;
        int actual = object.max1020(20, 10);
        assertEquals(expected,actual);
    }
    @Test
    public void shouldReturnTheLargerValueInRangeOf10To20InclusiveOrReturn03(){
        Max1020 object = new Max1020();
        int expected = 10;
        int actual = object.max1020(21, 10);
        assertEquals(expected,actual);
    }
    @Test
    public void shouldReturnTheLargerValueInRangeOf10To20InclusiveOrReturn04() {
        Max1020 object = new Max1020();
        int expected = 19;
        int actual = object.max1020(19, 11);
        assertEquals(expected,actual);
    }


}