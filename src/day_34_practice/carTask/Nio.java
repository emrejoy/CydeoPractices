package day_34_practice.carTask;

public class Nio extends Car implements AutoPilot, AutoPark{
    public Nio(String model, int year, double price, String color) {
        super("Nio", model, year, price, color);
    }

    @Override
    public void autoPark() {
        System.out.println("Nio is parking automatically");

    }

    @Override
    public void selfDrive() {
        System.out.println(getMake() + " " + getModel()  + " has auto Pilot");

    }

    @Override
    public void start() {
        System.out.println("Nio is now driving.");
    }

    @Override
    public void drive() {
        System.out.println(getMake()+ " " + getModel() + " is driving.");

    }
}
