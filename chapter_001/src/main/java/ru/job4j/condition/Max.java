package ru.job4j.condition;

public class Max {
    public static int max(int left, int right) {
        int result = (left >= right) ? left : right;  // Math.max(left, right)
        return result;
    }
}