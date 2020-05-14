package ru.job4j.calculator;
/**
 * Converter Конвертер валюты.
 * @author Karamyshev Iurii (007it@libero.it).
 * @since 27.12.2019.
 * @version 1
 */
public class Converter {
    /**
     * @param rubleToEuro - первый метод.
     * @param euroToRuble - второй метод.
     * @param rubleToDollar - третьий  метод.
     * @param dollarToRuble - четвёртый метод.
     * @return результат перевода валюты
     */
    public static int rubleToEuro(int value) {
        return value / 70;
    }
    public static int euroToRuble(int value) {
        return value * 70;
    }
    public static int rubleToDollar(int value) {
        return value / 60;
    }
    public static int dollarToRuble(int value) {
        return value * 60;
    }
    public static void main(String[] args) {
        int euro = rubleToEuro(140);
        int in1 = 140;
        int expected1 = 2;
        int out1 = rubleToEuro(in1);
        boolean passed1 = expected1 == out1;
        int eruble = euroToRuble(50);
        int in2 = 50;
        int expected2 = 3500;
        int out2 = euroToRuble(in2);
        boolean passed2 = expected2 == out2;
        int dollar = rubleToDollar(1500);
        int in3 = 1500;
        int expected3 = 25;
        int out3 = rubleToDollar(in3);
        boolean passed3 = expected3 == out3;
        int druble = dollarToRuble(30);
        int in4 = 30;
        int expected4 = 1800;
        int out4 = dollarToRuble(in4);
        boolean passed4 = expected4 == out4;
        System.out.println("140 rubles are " + euro + " euro.");
        System.out.println("140 rubles are 2 euro. Test result: " + passed1);
        System.out.println("50 euro are " + eruble + " rubles.");
        System.out.println("50 euro are 3500 rubles. Test result: " + passed2);
        System.out.println("1500 rubles are " + dollar + " dollars.");
        System.out.println("1500 rubles are 25 dollars. Test result: " + passed3);
        System.out.println("30 dollars are " + druble + " rubles.");
        System.out.println("30 dollars are 1800 rubles. Test result: " + passed4);
    }
}