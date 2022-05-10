package ru.job4j.oop;
/**
 * Animal наследует класс Predator.
 * @author Karamyshev Iurii (007it@libero.it).
 * @since 19.05.2020.
 * @version 1
 */
public class Animal extends Predator {
    /**
     * вызов конструктора родительского класса.
     * вывод на консоль имени класс
     */
    public Animal() {
        super();
        System.out.println("load Animal");
    }
    public static void main(String[] args) {
        Animal Animal = new Animal();
    }
}