package com.startjava.lesson_2_3_4.wolf;

public class WolfTest {

    public static void main(String[] args) {
        Wolf wolf = new Wolf();
        wolf.setGender("женский");
        wolf.setNickname("Багира");
        wolf.setWeight(5_300);
        wolf.setAge(4);
        wolf.setCoatColor("серый");

        System.out.println("Пол волка " + wolf.getGender());
        System.out.println("Кличка волка " + wolf.getNickname());
        System.out.println("Вес волка " + wolf.getWeight());
        System.out.println("Возраст волка " + wolf.getAge());
        System.out.println("Цвет шерсти волка " + wolf.getCoatColor());

        wolf.move();
        wolf.seat();
        wolf.run();
        wolf.howl();
        wolf.hunt();
    }
}