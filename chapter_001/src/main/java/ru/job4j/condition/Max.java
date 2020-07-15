package ru.job4j.condition;
/**
 * Max Сравнение двух, трёх и черытёх чисел и нахождение максимального из них.
 * @author Karamyshev Iurii (007it@libero.it).
 * @since 08.11.2019.(15.07.2020)
 * @version 1
 */
public class Max {
    public static int max(int left, int right) {
        int result = (left >= right) ? left : right;
        return result;
    }
    public static int max(int a, int b, int c) {
        return max(a, max(b, c));
    }

    public static int max(int a, int b, int c, int d) {
        return max(a, max(b, c, d));
    }
}