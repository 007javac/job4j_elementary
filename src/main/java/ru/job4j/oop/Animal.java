package ru.job4j.oop;
/**
 * Animal наследует класс Predator.
 * @author Karamyshev Iurii (007it@libero.it).
 * @since 19.05.2021.
 * @version 1
 */
public class Animal extends Predator {
    public Animal() {
        super();
        System.out.println("load Animal");
    }

    public static void main(String[] args) {
        Animal animal = new Animal();
    }
}