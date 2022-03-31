package edu.codingbat.warmup1;

import org.junit.Test;

import static org.junit.Assert.*;

public class StartOzTest {
    @Test
    public void shouldReturnStrWithFirst2CharsButIncludeFirstCharIfItIsOTheSecondIfZ1() {
        StartOz object = new StartOz();
        String expected = "oz";
        String actual = object.startOz("oznic");
    }
    @Test
    public void shouldReturnStrWithFirst2CharsButIncludeFirstCharIfItIsOTheSecondIfZ2() {
        StartOz object = new StartOz();
        String expected = "";
        String actual = object.startOz("zoo");
    }
    @Test
    public void shouldReturnStrWithFirst2CharsButIncludeFirstCharIfItIsOTheSecondIfZ3() {
        StartOz object = new StartOz();
        String expected = "o";
        String actual = object.startOz("ounce");
    }
    @Test
    public void shouldReturnStrWithFirst2CharsButIncludeFirstCharIfItIsOTheSecondIfZ4() {
        StartOz object = new StartOz();
        String expected = "z";
        String actual = object.startOz("zzz");
    }
}