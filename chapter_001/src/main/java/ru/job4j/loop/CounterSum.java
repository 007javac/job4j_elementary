package ru.job4j.loop;

public class CounterSum {
    public static int sum(int start, int finish) {
        int sum = 0;
        int index = 0;
        for (index = start; index <= finish; index++) {
            sum = sum + index;
        }
        return sum;
    }
    public static void main(String[] args) {
        System.out.println(sum(0, 4));
        System.out.println(sum(3, 6));
        System.out.println(sum(5, 9));
    }
}
