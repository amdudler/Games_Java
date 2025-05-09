package at.amir.game.firstgame.Testrelevant;

public class AeroCar extends Car {
    public AeroCar(String id, String name) {
        super(id, name);
    }

    @Override
    public void drive() {
        System.out.println(name + " is driving like a car.");
    }

    public void fly() {
        System.out.println(name + " is flying!");
    }
}


