package day_34_practice.deviceTask;

public class Google extends Phone implements Downloadable, AndroidApps {

    public Google(String brand, String model, String size, double price, String color, boolean hasBattery, boolean hasPowerButton) {
        super(brand, model, size, price, color, hasBattery, hasPowerButton);
    }

    @Override
    public void downloadApp() {

        System.out.println("You can download application from " + appStoreName + " for " + getBrand() + " " + getModel());
    }
}
