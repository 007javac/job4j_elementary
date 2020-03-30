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
    /*
    метод, который проверяет, чтобы все элементы в колонке были заполнены символом 'X'.
     */
    public static boolean monoVertical(char[][] board, int column) {
        boolean result = true;
        for (int index = 0; index < board.length; index++) {
            if (board[index][column] != 'X') {
                result = false;
                break;
            }
        }
        return result;
    }
}