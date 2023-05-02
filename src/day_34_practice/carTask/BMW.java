package day_34_practice.carTask;

public class BMW extends Car {
    public BMW(String model, int year, double price, String color) {

        super("BMW", model, year, price, color);
    }

    @Override
    public void start() {
        System.out.println("BMW has started.");
    }

    @Override
    public void drive() {
        System.out.println("BMW is driving.");

    }
}
