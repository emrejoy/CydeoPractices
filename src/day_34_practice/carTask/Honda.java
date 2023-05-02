package day_34_practice.carTask;

public class Honda extends Car {
    public Honda(String model, int year, double price, String color) {
        super("Honda", model, year, price, color);
    }

    @Override
    public void start() {
        System.out.println("Honda " + getModel() + " is starting.");
    }

    @Override
    public void drive() {

        System.out.println("Honda " + getModel() + " is driving.");
    }
}
