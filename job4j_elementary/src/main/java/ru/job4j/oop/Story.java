package ru.job4j.oop;

public class Story {
    public static void main(String[] args) {
        Pioneer petya = new Pioneer();
        Girl girl = new Girl();
        Wolfff wolfff = new Wolfff();
        girl.help(petya);
        wolfff.eat(girl);
        petya.kill(wolfff);
    }
}
