package day_34_practice.carTask;

public class Mercedes extends Car implements AutoPark {
    public Mercedes(String model, int year, double price, String color) {
        super("Mercedes", model, year, price, color);
    }

    @Override
    public void autoPark() {
        System.out.println(getMake() + " " + getModel()  + " has auto park");

    }
    @Override
    public void start() {
        System.out.println("Mercedes is now starting.");


    }

    @Override
    public void drive() {
        System.out.println("Mercedes is now driving.");

    }
}
