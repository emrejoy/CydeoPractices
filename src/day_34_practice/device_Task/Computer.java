package day_34_practice.device_Task;

public class Computer extends Device{

    public Computer(String brand, String model, String size, double price, String color, boolean hasBattery, boolean hasPowerButton) {
        super(brand, model, size, price, color, hasBattery, hasPowerButton);
    }

    @Override
    public void turnOn() {
        System.out.println(getBrand() + getModel() + " is turning on");

    }
    @Override
    public void turnOff() {
        System.out.println(getBrand() + getModel() + " is turning off");


    }
}
