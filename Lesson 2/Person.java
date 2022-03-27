public class Person {
    
    String gender = "male";
    String name = "Person name";
    int weight = 0;
    int age = 0;

    public void move() {
        System.out.println(this.name + " идёт..");
    }

    public void seat() {
        System.out.println(this.name + " сидит..");
    }

    public void run() {
        System.out.println(this.name + " бежит..");
    }

    public void say() {
        System.out.println(this.name + " говорит..");
    }

    public void learnJava() {
        System.out.println(this.name + " учит Java..");
    }
}