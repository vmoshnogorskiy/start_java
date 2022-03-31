public class JaegerTest {

    public static void main(String[] args) {
        Jaeger koreanRobot = new Jaeger();
        Jaeger australianRobot = new Jaeger();

        australianRobot.setModelName("Striker Eureka");
        System.out.println("Установлена модель робота: " + australianRobot.getModelName());
        australianRobot.setMark("Mark-5");
        System.out.println("Установлена марка робота: " + australianRobot.getMark());
        australianRobot.setOrigin("Australia");
        System.out.println("Установлена страна-производитель робота: " + australianRobot.getOrigin());
        australianRobot.setWeapon("Нагрудные ракетные установки");
        System.out.println("Выбрано оружие робота: " + australianRobot.getWeapon());
        australianRobot.setHeight(76f);
        System.out.println("Определена высота робота: " + australianRobot.getHeight());
        australianRobot.setWeight(1.8f);
        System.out.println("Определен вес робота: " + australianRobot.getWeight());
        australianRobot.setStrength(10);
        System.out.println("Определена сила робота: " + australianRobot.getStrength());
        australianRobot.setArmor(9);
        System.out.println("Определена броня робота: " + australianRobot.getArmor());

        koreanRobot.setModelName("Nova Hyperion");
        System.out.println("Установлена модель робота: " + koreanRobot.getModelName());
        koreanRobot.setMark("Mark-4");
        System.out.println("Установлена марка робота: " + koreanRobot.getMark());
        koreanRobot.setOrigin("South Korean");
        System.out.println("Установлена страна-производитель робота: " + koreanRobot.getOrigin());
        koreanRobot.setWeapon("Анти-кайдзю торпеды");
        System.out.println("Выбрано оружие робота: " + koreanRobot.getWeapon());
        koreanRobot.setHeight(74f);
        System.out.println("Определена высота робота: " + koreanRobot.getHeight());
        koreanRobot.setWeight(1.9f);
        System.out.println("Определен вес робота: " + koreanRobot.getWeight());
        koreanRobot.setStrength(7);
        System.out.println("Определена сила робота: " + koreanRobot.getStrength());
        koreanRobot.setArmor(8);
        System.out.println("Определена броня робота: " + koreanRobot.getArmor());

        if (koreanRobot.drift()) {
            System.out.println(koreanRobot.move());
            System.out.println(koreanRobot.scanKaiju());
            System.out.println(koreanRobot.useWeapon());
        }
        if (australianRobot.drift()) {
            System.out.println(australianRobot.move());
            System.out.println(australianRobot.scanKaiju());
            System.out.println(australianRobot.useWeapon());
        }

        australianRobot.setWeapon("Ручные лезвия");
        System.out.println(australianRobot.getModelName() + " изменил оружие на " + australianRobot.getWeapon());
        koreanRobot.setWeapon("Вибро меч");
        System.out.println(koreanRobot.getModelName() + " изменил оружие на " + koreanRobot.getWeapon());
    }
}