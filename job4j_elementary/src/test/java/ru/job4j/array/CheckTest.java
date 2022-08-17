package ru.job4j.array;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.hamcrest.MatcherAssert.assertThat;

public class CheckTest {
    @Test
    public void whenDataMonoByTrueThenTrue() {
        Check check = new Check();
        boolean[] input = new boolean[] {true, true, true};
        boolean resultArray = check.mono(input);
        assertThat(resultArray, is(true));
    }

    @Test
    public void whenDataNotMonoByTrueThenFalse() {
        Check check = new Check();
        boolean[] input = new boolean[] {true, false, true};
        boolean resultArray = check.mono(input);
        assertThat(resultArray, is(false));
    }

    @Test
    public void whenDataMonoByTrueThenTrueEvenSize() {
        Check check = new Check();
        boolean[] input = new boolean[] {true, true, true, true, true, true};
        boolean resultArray = check.mono(input);
        assertThat(resultArray, is(true));
    }

    @Test
    public void whenDataNotMonoByTrueThenFalseEvenSize() {
        Check check = new Check();
        boolean[] input = new boolean[] {true, false, true, true, true, true};
        boolean resultArray = check.mono(input);
        assertThat(resultArray, is(false));
    }
}