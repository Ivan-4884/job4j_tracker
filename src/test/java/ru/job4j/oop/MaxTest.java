package ru.job4j.oop;

import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

public class MaxTest {

    @Test
    public void max2() {
        int max2 = Max.max(2, 3);
        assertThat(max2, is(3));
    }

    @Test
    public void Max3() {
        int max3 = Max.max(2,7,4);
        assertThat(max3, is(7));
    }

    @Test
    public void Max4() {
        int max4 = Max.max(0,2,9,4);
        assertThat(max4, is(9));
    }
}