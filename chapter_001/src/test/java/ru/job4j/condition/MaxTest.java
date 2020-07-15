package ru.job4j.condition;

import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class MaxTest {
    @Test
    public void whenMax1To2Then2() {
        int result = Max.max(1,2);
        assertThat(result, is(2));
    }
    @Test
    public void whenMax1To2Then1() {
        int result = Max.max(3,1);
        assertThat(result, is(3));
    }
    @Test
    public void whenMax2To2() {
        int result = Max.max(4,4);
        assertThat(result, is(4));
    }
    @Test
    public void whenMax2To1To0Then2() {
        int result = Max.max(2, 1, 0);
        assertThat(result, is(2));
    }
    @Test
    public void whenMax5To5To0To0Then5() {
        int result = Max.max(5, 5, 0, 0);
        assertThat(result, is(5));
    }
}
