public class Person {
    
    private String name;
    private static int counter = 0;

    public Person(String name) {
        if (name != null) {
            this.name = name;
        } else {
            counter++;
            this.name = "Person_" + counter;
        }
    }

    public String getName() {
        return name;
    }

    public Object clone() {
        return new Person(name);
    }
}