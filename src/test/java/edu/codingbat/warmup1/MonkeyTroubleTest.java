package edu.codingbat.warmup1;

import org.junit.Test;

import static org.junit.Assert.*;

public class MonkeyTroubleTest {
    @Test
    public void shouldTellIfWeAreInTrouble() {
        MonkeyTrouble trouble = new MonkeyTrouble();
        assertTrue(trouble.monkeyTrouble(false,false));

    }
    @Test
    public void shouldTellIfWeAreInTrouble2() {
        MonkeyTrouble trouble = new MonkeyTrouble();
        assertTrue(trouble.monkeyTrouble(false,false));

    }
    @Test
    public void shouldTellIfWeAreInTrouble3() {
        MonkeyTrouble trouble = new MonkeyTrouble();
        assertFalse(trouble.monkeyTrouble(true,false));

    }
}