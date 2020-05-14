package ru.job4j.condition;
/**
 * Max Сравнение двух чисел и нахождение максимального из них.
 * @author Karamyshev Iurii (007it@libero.it).
 * @since 08.11.2019.
 * @version 1
 */
public class Max {
    public static int max(int left, int right) {
        int result = (left >= right) ? left : right;  // Math.max(left, right)
        return result;
    }
}