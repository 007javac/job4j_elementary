package ru.job4j.max.oop;
/**
 * Tiger.
 * @author Karamyshev Iurii (007it@libero.it).
 * @since 19.05.2020.
 * @version 1
 */
public class Tiger {
    /**
     * вызов конструктора родительского класса.
     * вывод на консоль имени класс
     */
    public Tiger() {
        super();
        System.out.println("load Tiger");
    }
    public static void main(String[] args) {
        Tiger Tiger = new Tiger();
    }
}