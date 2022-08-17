package ru.job4j.loop;

public class PrimeNumber {
    public int calc(int num) {
        int count = 0;
        CheckPrimeNumber ourNumber = new CheckPrimeNumber();
        boolean truePrime = false;
        for (int i = 1; i < (num + 1); i++) {
            truePrime = ourNumber.check(i);
            if (truePrime) {
                count++;
            }
        }
        return count;
    }
}