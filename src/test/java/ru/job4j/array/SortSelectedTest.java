package ru.job4j.array;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.hamcrest.MatcherAssert.assertThat;

public class SortSelectedTest {
    @Test
    public void whenSortFive() {
        int[] input = new int[] {3, 4, 1, 2, 5};
        int[] result = SortSelected.sort(input);
        int[] expect = new int[] {1, 2, 3, 4, 5};
        assertThat(result, is(expect));
    }

    @Test
    public void whenSortThree() {
        int[] input = new int[] {3, 2, 4};
        int[] result = SortSelected.sort(input);
        int[] expect = new int[] {2, 3, 4};
        assertThat(result, is(expect));
    }
}