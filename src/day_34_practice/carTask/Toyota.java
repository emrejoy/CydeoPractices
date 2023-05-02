package day_34_practice.carTask;

public class Toyota extends Car {


    public Toyota(String model, int year, double price, String color) {
        super("Toyota",model, year, price, color);
    }

    @Override
    public void start() {
        System.out.println("Toyota " + getModel() + " is starting.");
    }

    @Override
    public void drive() {
        System.out.println("Toyota " + getModel() + " is driving.");
    }
}
