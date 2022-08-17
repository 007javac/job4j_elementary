package ru.job4j.array;

import org.junit.Test;

import static org.hamcrest.Matchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

public class TurnTest {
    @Test
    public void whenTurnArrayWithEvenAmountOfElementsThenTurnedArray() {
        Turn turner = new Turn();
        int[] input = new int[] {4, 1, 6, 2};
        int[] resultArray = turner.back(input);
        int[] expectArray = new int[] {2, 6, 1, 4};
        assertThat(resultArray, is(expectArray));
    }

    @Test
    public void whenTurnArrayWithOddAmountOfElementsThenTurnedArray() {
        Turn turner = new Turn();
        int[] input = new int[] {1, 2, 3, 4, 5};
        int[] resultArray = turner.back(input);
        int[] expectArray = new int[] {5, 4, 3, 2, 1};
        assertThat(resultArray, is(expectArray));
    }
}