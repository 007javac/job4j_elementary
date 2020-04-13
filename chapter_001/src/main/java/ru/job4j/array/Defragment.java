package ru.job4j.array;

public class Defragment {
    public static String[] compress(String[] array) {
        for (int index = 0; index < array.length; index++) {
            if (array[index] == null) {                 // если ячейка пустая.
                int count = index + 1;                  // то начнем со следующей.
                while (count < array.length) {          // пока не дойдем до конца массива.
                    if (array[count] != null) {         // если нашли не пустую.
                        array[index] = array[count];    //то заменяем их местами.
                        array[count] = null;
                        break;
                    }
                   count++; //если же не нашли, то движемся к сдедующей.
                }
            }
            System.out.print(array[index] + " ");
        }
        return array;
    }

    public static void main(String[] args) {
        String[] input = {"I", null, "wanna", null, "be", null, "compressed"};
        String[] compressed = compress(input);
        System.out.println();
        for (int index = 0; index < compressed.length; index++) {
            System.out.print(compressed[index] + " ");
        }
    }
}