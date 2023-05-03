package day_34_practice.deviceTask.deviceTask;

public class Iphone extends Phone implements Downloadable, AppleApps {


    public Iphone(String brand, String model, String size, double price, String color, boolean hasBattery, boolean hasPowerButton) {
        super(brand, model, size, price, color, hasBattery, hasPowerButton);
    }
    @Override
    public void downloadApp() {
        System.out.println("You can download application from " + appStoreName + " for " + getBrand() + " " + getModel());
    }

    public String toString(){
        return getClass().getSimpleName()+" {" +
                "brand='" + getBrand() + '\'' +
                ", model='" + getModel() + '\'' +
                ", size='" + getSize() + '\'' +
                ", price=" + getPrice() +
                ", color='" + getColor() + '\'' +
                ", hasPowerButton=" + isHasPowerButton() +
                ", hasBattery=" + isHasBattery() +
                '}';
    }
}
