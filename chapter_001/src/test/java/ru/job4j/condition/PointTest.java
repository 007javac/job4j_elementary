package ru.job4j.condition;

import org.junit.Assert;
import org.junit.Test;

public class PointTest {

    @Test
    public void distance() {
        Point first = new Point(3, 3);
        Point second = new Point(10, 22);
        double out = first.distance(second);
        Assert.assertEquals(20.24, out, 0.01);
    }
}