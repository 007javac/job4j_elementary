package ru.job4j.array;

public class SwitchArrayNext {
    public static int[] swap(int[] array, int source, int dest) {
            int temp1 = array[array.length - source - 1];
            array[array.length - source - 1] = array[source];
            array[source] = temp1;
            return array;
    }

    public static int[] swapBorder(int[] array) {
        int temp = array[0];
        array[0] = array[array.length - 1];
        array[array.length - 1] = temp;
        return array;
    }

    public static void main(String[] args) {
        int[] nums = new int[] {1, 2, 3, 4, 5, 6};
        int[] rsl = swapBorder(nums);
        for (int index = 0; index < rsl.length; index++) {
            System.out.println(rsl[index]);
        }
    }
}