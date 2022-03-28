public class WolfTest {

    public static void main(String[] args) {
        Wolf wolf = new Wolf();
        wolf.gender = "женский";
        wolf.nickname = "Багира";
        wolf.weight = 5_300;
        wolf.age = 3;
        wolf.coatColor = "серый";

        System.out.println("Пол волка " + wolf.gender);
        System.out.println("Кличка волка " + wolf.nickname);
        System.out.println("Вес волка " + wolf.weight);
        System.out.println("Возраст волка " + wolf.age);
        System.out.println("Цвет шерсти волка " + wolf.coatColor);

        wolf.move();
        wolf.seat();
        wolf.run();
        wolf.howl();
        wolf.hunt();
    }
}