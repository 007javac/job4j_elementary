package ru.job4j.array;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.hamcrest.MatcherAssert.assertThat;

public class MinTest {
    @Test
    public void whenFirstMin() {
        assertThat(Min.findMin(new int[] {0, 5, 10}), is(0));
    }

    @Test
    public void whenLastMin() {
        assertThat(
                Min.findMin(
                        new int[] {10, 5, 3}
                ),
                is(3)
        );
    }

    @Test
    public void whenMiddleMin() {
        assertThat(
                Min.findMin(
                        new int[] {10, 3, 2, 9}
                ),
                is(2)
        );
    }
}