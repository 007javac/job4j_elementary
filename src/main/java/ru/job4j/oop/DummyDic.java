package ru.job4j.oop;

public class DummyDic {
    public String engToRus(String eng) {
        String word = " неизвестное слово - " + eng;
        return word;
    }

    public static void main(String[] args) {
        DummyDic book = new DummyDic();
        String reed = book.engToRus("eng.");
        System.out.println("Dic reed:" + reed);
    }
}
