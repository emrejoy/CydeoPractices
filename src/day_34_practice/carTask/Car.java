package day_34_practice.carTask;

public abstract class Car {

    //Variables:
    //make (final), model (final), year (final), price, color
    //Encapsulate all the fields


    private final String make;
    private final String model;
    private final int year;
    private double price;
    private String color;

    //Add a constructor that can set all the fields

    public Car(String make, String model, int year, double price, String color) {
        if (make == null || make.isEmpty()) {
            System.err.println(" can not be null or empty");
            System.exit(1);
        }
        this.make = getClass().getSimpleName();
        if (model == null || model.isEmpty()) {
            System.err.println(" can not be null or empty");
            System.exit(1);
        }
        this.model = model;
        if (year < 1886) {
            System.err.println("Year cannot be less than 1886");
        }
        this.year = year;
        setPrice(price);
        setColor(color);
    }


    public String getMake() {
        return make;
    }

    public String getModel() {
        return model;
    }

    public int getYear() {
        return year;
    }

    public double getPrice() {
        return price;
    }

    public String getColor() {
        return color;
    }

    public void setPrice(double price) {
        if (price < 0) {
            System.err.println("Price cannot be negative");
        }
        this.price = price;
    }

    public void setColor(String color) {
        if (color == null || color.isEmpty()) {
            System.err.println("can not be null or empty");
        }
        this.color = color;
    }

    public abstract void start();

    public abstract void drive();

    public void stop() {
        System.out.println("The car is now stopped.");
    }

    @Override
    public String toString() {
        return "Car{" +
                "make='" + make + '\'' +
                ", model='" + model + '\'' +
                ", year=" + year +
                ", price=" + price +
                ", color='" + color + '\'' +
                '}';
    }
}


/*

 */