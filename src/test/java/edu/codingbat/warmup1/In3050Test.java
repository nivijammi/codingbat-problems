package edu.codingbat.warmup1;

import org.junit.Test;

import static org.junit.Assert.*;

public class In3050Test {
    @Test
    public void shouldReturnTrueIfBothGivenValInTheRange30tO40InclusiveOr40To50Inclusive1() {
        In3050 object = new In3050();
        assertFalse(object.in3050(35, 45));

    }
    @Test
    public void shouldReturnTrueIfBothGivenValInTheRange30tO40InclusiveOr40To50Inclusive2() {
        In3050 object = new In3050();
        assertFalse(object.in3050(50, 51));

    }
    @Test
    public void shouldReturnTrueIfBothGivenValInTheRange30tO40InclusiveOr40To50Inclusive3() {
        In3050 object = new In3050();
        assertTrue(object.in3050(40, 39));

    } @Test
    public void shouldReturnTrueIfBothGivenValInTheRange30tO40InclusiveOr40To50Inclusive4() {
        In3050 object = new In3050();
        assertTrue(object.in3050(40, 50));

    }

}