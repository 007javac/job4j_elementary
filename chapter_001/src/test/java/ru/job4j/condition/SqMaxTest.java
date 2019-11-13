package ru.job4j.condition;

import org.junit.Test;
import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;

public class SqMaxTest {
    @Test
    public void whenFirstMax() {
        SqMax check = new SqMax();
        int result = check.max(9, 7, 4, 1);
        assertThat(result, is(9));
    }
    @Test
    public void whenSecondMax() {
        SqMax check = new SqMax();
        int result = check.max(9, 10, 4, 1);
        assertThat(result, is(10));
    }
    @Test
    public void whenThirdMax() {
        SqMax check = new SqMax();
        int result = check.max(9, 15, 45, 1);
        assertThat(result, is(45));
    }
    @Test
    public void whenForthMax() {
        SqMax check = new SqMax();
        int result = check.max(9, 7, 4, 50);
        assertThat(result, is(50));
    }
    @Test
    public void whenMax() {
        SqMax check = new SqMax();
        int result = check.max(9, 7, 14, 50);
        assertThat(result, is(50));
    }
}
