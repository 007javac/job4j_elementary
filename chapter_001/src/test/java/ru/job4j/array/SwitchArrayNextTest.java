package ru.job4j.array;

import org.junit.Test;

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;

public class SwitchArrayNextTest {

    @Test
    public void whenSwap0to3() {
        int[] input = {1, 2, 3, 4};
        int[] expect = {4, 2, 3, 1};
        int[] rsl = SwitchArrayNext.swap(input, 0, input.length - 1);
        assertThat(rsl, is(expect));
    }

    @Test
    public void whenSwap0to5() {
        int[] input = {1, 2, 3, 4, 5, 6};
        int[] expect = {4, 2, 3, 6, 1, 5};
        int[] rsl = SwitchArrayNext.swap(input, 0, input.length - 1);
        assertThat(rsl, is(expect));
    }
}