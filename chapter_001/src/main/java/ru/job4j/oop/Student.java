package ru.job4j.oop;
/**
 * Student.
 * @author Karamyshev Iurii (007it@libero.it).
 * @since 20.05.2020.
 * @version 1
 */

public class Student {
    public void music() {
        System.out.println("Tra tra tra");
    }
    public void song() {
        System.out.println("I believe I can fly");
    }
    public static void main(String[] args) {
        Student petya = new Student();
        petya.music();
        petya.music();
        petya.music();
        petya.song();
        petya.song();
        petya.song();
    }
}