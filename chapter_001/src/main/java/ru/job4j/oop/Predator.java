package ru.job4j.oop;
/**
 * Predator наследует класс Tiger.
 * @author Karamyshev Iurii (007it@libero.it).
 * @since 19.05.2020.
 * @version 1
 */
public class Predator extends Tiger {
    public Predator() {
        super();
        System.out.println("load Predator");
    }
    public static void main(String[] args) {
        Predator Predator = new Predator();
    }
}
