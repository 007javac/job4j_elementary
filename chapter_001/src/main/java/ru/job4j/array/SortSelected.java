package ru.job4j.array;

/**
 * Class SortSelected.
 *
 * @author Karamyshev
 * @version 1.0
 * @since 04.03.2020
 */

public class SortSelected {

    /**
     * Method sort сортирует массив по возрастанию методом выборки
     * @param data массив чисел, который нужно отсортировать по возрастанию
     * @return возвращаем отсортированый по возрастанию массив int[]
     */

    public static int[] sort(int[] data) {
        for (int i = 0; i < data.length; i++) {
            int min = MinDiapason.findMin(data, i, data.length - 1);
            int index = FindLoop.indexOfRange(data, min, i, data.length - 1);
            data[index] = data[i];
            data[i] = min;
        }
        return data;
    }
}