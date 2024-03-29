package ru.job4j.loop;

import org.junit.Test;

import static org.hamcrest.Matchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

public class CheckPrimeNumberTest {

    @Test
    public void when0() {
        CheckPrimeNumber prime = new CheckPrimeNumber();
        boolean rsl = prime.check(0);
        assertThat(rsl, is(false));
    }

    @Test
    public void when1() {
        CheckPrimeNumber prime = new CheckPrimeNumber();
        boolean rsl = prime.check(1);
        assertThat(rsl, is(false));
    }

    @Test
    public void when3() {
        CheckPrimeNumber prime = new CheckPrimeNumber();
        boolean rsl = prime.check(3);
        assertThat(rsl, is(true));
    }

    @Test
    public void when4() {
        CheckPrimeNumber prime = new CheckPrimeNumber();
        boolean rsl = prime.check(4);
        assertThat(rsl, is(false));
    }

    @Test
    public void when5() {
        CheckPrimeNumber prime = new CheckPrimeNumber();
        boolean rsl = prime.check(5);
        assertThat(rsl, is(true));
    }
}