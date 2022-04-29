package ru.job4j.max.oop;

public class Calculator {

    private static int x = 5;

    public static int sum(int y) {
        return x + y;
    }

    public static int minus(int y) {
        return y - x;
    }

    public int multiply(int a) {
        return x * a;
    }

    public int divide(int a) {
        return a / x;
    }

    public int sumAllOperation(int a) {
        return sum(a) + minus(a) + multiply(a) + divide(a);
    }
    public static void main(String[] args) {
        int sum = sum(5);
        int minus = minus(5);
        Calculator calculator = new Calculator();
        int multiply = calculator.multiply(5);
        int divide = calculator.divide(5);
        int result = sum + minus + multiply + divide;
        System.out.println("Сумма операций: " + result);
        result = calculator.sumAllOperation(5);
        System.out.println("Через метод sumAllOperation : " + result);
    }
}