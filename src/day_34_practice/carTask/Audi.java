package day_34_practice.carTask;

public class Audi extends Car implements AutoPark{

    public Audi(String model, int year, double price, String color) {
        super("Audi", model, year, price, color);
    }
    @Override
    public void autoPark() {
        System.out.println(getMake() + " " + getModel()  + " has auto park");
    }
    @Override
    public void start() {
        System.out.println("Audi is now starting.");

    }

    @Override
    public void drive() {
        System.out.println("Audi is now driving.");

    }
}
