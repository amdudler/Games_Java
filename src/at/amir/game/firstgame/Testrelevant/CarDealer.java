package at.amir.game.firstgame.Testrelevant;

import java.util.ArrayList;
import java.util.List;

public class CarDealer {
    private List<Interface> vehicles = new ArrayList<>();

    public void addVehicle(Interface v) {
        vehicles.add(v);
    }

    public void printVehicles() {
        for (Interface v : vehicles) {
            System.out.println("ID: " + v.getID() + ", Name: " + v.getName());
            v.drive();

            if (v instanceof AeroCar) {
                ((AeroCar) v).fly();
            }

            System.out.println();
        }
    }
}

