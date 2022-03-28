public class Wolf {
    
    String gender;
    String nickname;
    int weight;
    int age;
    String coatColor;

    public void move() {
        System.out.println(nickname + " идёт");
    }

    public void seat() {
        System.out.println(nickname + " сидит");
    }

    public void run() {
        System.out.println(nickname + " бежит");
    }

    public void howl() {
        System.out.println(nickname + " воет");
    }

    public void hunt() {
        System.out.println(nickname + " охотится");
    }
}