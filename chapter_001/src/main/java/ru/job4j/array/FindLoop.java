package ru.job4j.array;

public class FindLoop {
    /**
     * Method indexOf.
     * Метод должен вернуть индекс элемента массива равного искомому значению.
     *
     * @param data - массив.
     * @param el - искомое значение.
     * @return индекс элемента массива равного искомому значению.
     */
    public static int indexOfRange(int[] data, int el, int start, int finish){
        int rst = -1;
        for(int index = start; index <= finish; index++){
            if(data[index] == el) {
                rst = index;
                break;
            }
        }
        return rst;
    }
    public int indexOf(int[] data, int el) {
        int rst = -1; // если элемента нет в массиве, то возвращаем -1.
        for (int index = 0; index < data.length; index++) {
            if (data[index] == el) {
                rst = index;
                break;
            }
        }
        return rst;
    }
}