package at.amir.game.firstgame.Testrelevant;

public class Train implements Interface {
    private String id;
    private String name;

    public Train(String id, String name) {
        this.id = id;
        this.name = name;
    }

    public String getID() { return id; }
    public String getName() { return name; }

    public void drive() {
        System.out.println(name + " is moving on rails.");
    }
}

