package ru.job4j.oop;

public class Story {
    public static void main(String[] args) {
        Pioneer petya = new Pioneer();
        Girl girl = new Girl();
        Wolfff wolfff = new Wolfff();
        /**
         * создали три обьекта, вызвали методы у обьектов и передали в них другие обьекты
         */
        girl.help(petya);
        wolfff.eat(girl);
        petya.kill(wolfff);
    }
}
