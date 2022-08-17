package ru.job4j.condition;
/**
 * MultiMax Сравнение трёх чисел и нахождение максимального из них.
 * @author Karamyshev Iurii (007it@libero.it).
 * @since 12.11.2019.
 * @version 1
 */
public class MultiMax {
    public int max(int first, int second, int third) {
        int result = third > (first > second ? first : second) ? third : (first > second ? first : second);
        return result;
    }
}