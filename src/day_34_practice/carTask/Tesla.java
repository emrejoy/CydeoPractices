package day_34_practice.carTask;

public class Tesla extends Car implements AutoPark, AutoPilot{
    public Tesla(String model, int year, double price, String color) {
        super("Tesla", model, year, price, color);
    }

    @Override
    public void autoPark() {
        System.out.println("Tesla is parking automatically");
    }

    @Override
    public void selfDrive() {
        System.out.println(getMake() + " " + getModel()  + " has auto Pilot");

    }

    @Override
    public void start() {
        System.out.println(getMake()+ " " + getModel() + " is driving.");
    }

    @Override
    public void drive() {
        System.out.println("Tesla is now driving.");

    }
}
