package ru.job4j.array;
/*
Mетод, проверяет то, что все  элементы в строке заполнены символом 'X'.
 */
public class MatrixCheck {
    public static boolean monoHorizontal(char[][] board, int row) {
        boolean result = true;
        for (int index = 0; index < board.length; index++) {
            if (board[row][index] != 'X') {
                result = false;
                break;
            }
        }
        return result;
    }
}