package ru.job4j.loop;

public class Counter {
    public static int add(int start, int finish) {
        int sum = 0;
        int i = 0;
        for (i = start; i <= finish; i++) {
            if (i % 2 == 0) {
                sum += i;
            }
        }
        return sum;
    }
}
