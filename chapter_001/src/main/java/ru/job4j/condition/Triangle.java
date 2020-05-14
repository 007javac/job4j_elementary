package ru.job4j.condition;
/**
 * Triangle - проверка, существует ли треугольник.
 * @author Karamyshev Iurii (007it@libero.it).
 * @since 12.01.2020.
 * @version 1
 */
public class Triangle {
    public static boolean exist(double ab, double ac, double bc) {
        if (ab + ac > bc && ac + bc > ab && ab + bc > ac) {
            return true;
        } else {
            return false;
        }
    }
}