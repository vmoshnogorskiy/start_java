public class Player {
    
    private String name;
    private static int counter = 0;

    public Player(String name) {
        if (name != null) {
            this.name = name;
        } else {
            counter++;
            this.name = "Player_" + counter;
        }
    }

    public String getName() {
        return name;
    }
}