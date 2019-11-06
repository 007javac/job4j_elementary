package ru.job4j.condition;

public class Triangle {

    public static boolean exist(double ab, double ac, double bc) {
        boolean exist = true;
        if (ab+ac>bc && ac+bc>ab && ab+bc>ac);
        return exist;
    }

    public static boolean noexist(double ab, double ac, double bc) {
        boolean noexist = false;
        if (ab + ac < bc && ac + bc < ab && ab + bc < ac);
        return noexist;
    }
}