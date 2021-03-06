package ru.job4j.pojo;

public class Book {
    private String nameBook;
    private int pagesNumbers;

    public Book(String nameBook, int pagesNumbers) {
        this.nameBook = nameBook;
        this.pagesNumbers = pagesNumbers;
    }

    public String getNameBook() {
        return nameBook;
    }

    public void setNameBook(String nameBook) {
        this.nameBook = nameBook;
    }

    public int getPagesNumbers() {
        return pagesNumbers;
    }

    public void setPagesNumbers(int pagesNumbers) {
        this.pagesNumbers = pagesNumbers;
    }
}
