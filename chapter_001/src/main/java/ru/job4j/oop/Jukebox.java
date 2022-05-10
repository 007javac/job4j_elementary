package ru.job4j.oop;
/**
 * Класс Jukebox.
 * @author Karamyshev Iurii (007it@libero.it).
 * @since 01.06.2020.
 * @version 1
 */
public class Jukebox {
    /**
     * метода music.
     * метода main.
     * вывод на консоль результата, в зависимости от position.
     * вызов метода music у объекта jukebox
     */
    public void music(int position) {
        if(position == 1) {
            System.out.println("Пусть бегут неуклюже");
        } else if (position == 2) {
            System.out.println("Спокойной ночи");
        } else {
            System.out.println("Песня не найдена");
        }
    }
    public static void main(String[] args) {
        Jukebox jukebox = new Jukebox();
        jukebox.music(1);
        jukebox.music(2);
        jukebox.music(3);
    }
}
