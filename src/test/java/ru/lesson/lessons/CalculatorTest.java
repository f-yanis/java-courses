package ru.lesson.lessons;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class CalculatorTest {
    Calculator cal = new Calculator();

    @Test
    public void add() throws Exception {
        cal.add(5,5);
        Assert.assertEquals(10, cal.getResult());
    }

    @Test
    public void sub() throws Exception {
        cal.sub(10, 5);
        Assert.assertEquals(5, cal.getResult());
    }

    @Test
    public void mult() throws Exception {
        cal.mult(5, 5);
        Assert.assertEquals(25, cal.getResult());
    }

    @Test
    public void div() throws Exception {
        cal.div(10, 2);
        Assert.assertEquals(5, cal.getResult());
    }

    @Test
    public void exp() throws Exception {
        cal.exp(5, 4);
        Assert.assertEquals(625, cal.getResult());
    }
}