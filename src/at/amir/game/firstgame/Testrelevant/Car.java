package at.amir.game.firstgame.Testrelevant;

public class Car implements Interface {
    protected String id;
    protected String name;

    public Car(String id, String name) {
        this.id = id;
        this.name = name;
    }

    public String getID() { return id; }
    public String getName() { return name; }

    public void drive() {
        System.out.println(name + " is driving on the road.");
    }
}


