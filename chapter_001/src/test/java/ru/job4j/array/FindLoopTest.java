package ru.job4j.array;

import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class FindLoopTest {

    @Test
    public void whenArrayHas5Then0() {
        FindLoop find = new FindLoop();
        int[] input = new int[] {5, 10, 3};
        int value = 5;
        int result = find.indexOf(input, value);
        int expect = 0;
        assertThat(result, is(expect));
    }

    /**
     * Проверяет индекс элемента массива  со значением 10, значение отсутствует, результат -1(Тестирование).
     */
    @Test
    public void whenArrayHas10ThenMinusOne() {
        FindLoop find = new FindLoop();
        int[] input = new int[] {1, 4, 7, 11, 12, 16, 19, 24, 31, 45};
        int value = 10;
        int result = find.indexOf(input, value);
        int expect = -1;
        assertThat(result, is(expect));
    }

    @Test
    public void whenArrayHas8Then3() {
        FindLoop find = new FindLoop();
        int[] input = new int[] {1, 4, 11, 8, 12, 16, 19, 24};
        int value = 8;
        int result = find.indexOf(input, value);
        int expect = 3;
        assertThat(result, is(expect));
    }
}