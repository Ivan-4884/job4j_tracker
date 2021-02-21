package ru.job4j.oop;

import org.junit.Test;

import static org.hamcrest.Matchers.closeTo;
import static org.junit.Assert.*;

public class PointTest {

    @Test
    public void distance() {
        Point a = new Point(0, 4);
        Point b = new Point(4, 4);
        double dist = a.distance(b);
        assertThat(dist, closeTo(4, 0.001));
    }

    @Test
    public void distance3d() {
        Point a = new Point(0, 2, 4);
        Point b = new Point(0, 3, 5);
        double dist = a.distance3d(b);
        assertThat(dist, closeTo(1.414,0.001));
    }
}