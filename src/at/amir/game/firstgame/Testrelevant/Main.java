package at.amir.game.firstgame.Testrelevant;

public class Main {
    public static void main(String[] args) {
        CarDealer dealer = new CarDealer();

        Interface car = new Car("car1", "Opel");
        Interface train = new Train("train1", "ICE");
        Interface aerocar = new AeroCar("aero1", "SkyJet");

        dealer.addVehicle(car);
        dealer.addVehicle(train);
        dealer.addVehicle(aerocar);

        dealer.printVehicles();
    }
}
