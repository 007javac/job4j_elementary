    package ru.job4j.pojo;

public class Library {
    public static void main(String[] args) {
        Book cleanCode = new Book("Clean code", 500);
        Book java8 = new Book("Java8", 712);
        Book headFirst = new Book("Head first", 708);
        Book jocker = new Book("Jocker", 350);
        Book[] library = new Book[4];
        library[0] = cleanCode;
        library[1] = java8;
        library[2] = headFirst;
        library[3] = jocker;
        for (int index = 0; index < library.length; index++) {
            System.out.println(library[index].getNameBook() + " - " + library[index].getPagesNumbers());

        }
        Book temp = library[0];
        library[0] = library[3];
        library[3] = temp;
        for (int index = 0; index < library.length; index++) {
            if (library[index].getNameBook().equals("Clean code")) {
                System.out.println(library[index].getNameBook() + " - " + library[index].getPagesNumbers());
            }
        }
    }
}