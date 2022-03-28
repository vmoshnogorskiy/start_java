public class Person {
    
    String gender = "male";
    String name = "Person name";
    int weight = 0;
    int age = 0;

    public void move() {
        System.out.println(name + " идёт..");
    }

    public void seat() {
        System.out.println(name + " сидит..");
    }

    public void run() {
        System.out.println(name + " бежит..");
    }

    public void say() {
        System.out.println(name + " говорит..");
    }

    public void learnJava() {
        System.out.println(name + " учит Java..");
    }
}