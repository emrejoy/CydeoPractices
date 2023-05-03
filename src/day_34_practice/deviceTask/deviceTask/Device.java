package day_34_practice.deviceTask.deviceTask;

public abstract class Device {

    private final String brand, model, size;
    private double price;
    private String color;
    private boolean hasBattery;
    private boolean hasPowerButton;

    public void setHasBattery(boolean hasBattery) {
        this.hasBattery = hasBattery;
    }

    public Device(String brand, String model, String size, double price, String color, boolean hasBattery, boolean hasPowerButton) {
        if (brand.isEmpty()){
            System.err.println("Brand con not be empty "+brand);
            System.exit(1);
        }
        this.brand = brand;
        if (model.isEmpty()){
            System.err.println("Model con not be empty "+model);
            System.exit(1);
        }
        this.model = model;
        if (size.isEmpty()){
            System.err.println("Size con not be empty "+size);
            System.exit(1);
        }
        this.size = size;
        setPrice(price);
        setColor(color);
        setHasBattery(hasBattery);
        setHasPowerButton(hasPowerButton);

    }

    public String getBrand() {
        if (brand == null){
            System.err.println("Invalid brand "+brand);
            System.exit(1);
        }
        return brand;
    }

    public String getModel() {
        if (model == null){
            System.err.println("Invalid model "+model);
            System.exit(1);
        }
        return model;
    }

    public String getSize() {
        if (size == null){
            System.err.println("Invalid size "+size);
            System.exit(1);
        }
        return size;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        if (price <= 0){
            System.err.println("Price can not be negative or zero "+price);
        }
        this.price = price;
    }

    public String getColor() {
        if (color == null){
            System.err.println("Invalid color "+color);
            System.exit(1);
        }
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public boolean isHasPowerButton() {
        return hasPowerButton;
    }

    public void setHasPowerButton(boolean hasPowerButton) {
        this.hasPowerButton = hasPowerButton;
    }

    public boolean isHasBattery() {
        return hasBattery;
    }

    public void set(boolean hasBattery) {
        this.hasBattery = hasBattery;
    }

    public abstract void turnOn();
    public abstract void turnOff();

    @Override
    public String toString() {
        return getClass().getSimpleName()+" {" +
                "brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", size='" + size + '\'' +
                ", price=" + price +
                ", color='" + color + '\'' +
                ", hasPowerButton=" + hasPowerButton +
                ", hasBattery=" + hasBattery +
                '}';
    }
}