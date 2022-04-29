package ru.job4j.max.oop;
/**
 * Класс Cat.
 * @author Karamyshev Iurii (007it@libero.it).
 * @since 04/06/2020.
 * @version 1
 */
public class Cat {
    /**
     * метода giveNick выводит на консоль имя кота.
     * метода show выводит на консоль содержимое полей name и food.
     * метода eat записывает в поле обьекта данные.
     * вывод на консоль результатов
     */
    private String food;
    private String name;

    public void giveNick(String nick) {
        this.name = nick;
    }
    public void show() {
        System.out.println(this.name + this.food);
    }
    public void eat(String meat) {
        this.food = meat;
    }
    public static void main(String[] args) {
        System.out.println("There are gav's food.");
        Cat gav = new Cat();
        gav.giveNick("Gav ");
        gav.eat("eat kotleta.");
        gav.show();
        System.out.println("There are black's food.");
        Cat black = new Cat();
        black.giveNick("Black ");
        black.eat("eat fish.");
        black.show();
    }
}